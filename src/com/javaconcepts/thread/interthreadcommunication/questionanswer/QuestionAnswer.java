package com.javaconcepts.thread.interthreadcommunication.questionanswer;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 29/01/17
 * Time: 6:05 PM
 */
class Chat {
    boolean flag = false;

    public synchronized void question(String msg) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = true;
        notify();
    }

    public synchronized void answer(String msg) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = false;
        notify();
    }
}

class Thread1 implements Runnable {
    private Thread t;
    Chat m;
    private String[] s1 = {"Hi", "How are you?", "I'm also doing fine !"};

    public Thread1(Chat m) {
        this.m = m;
        t = new Thread(this, "Question");
        t.start();
    }

    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.question(s1[i]);
        }
    }
}

class Thread2 implements Runnable {
    private Thread t;
    Chat m;
    private String[] s2 = {"Hi", "I'm good, what about you ?", "Great !!"};

    public Thread2(Chat m) {
        this.m = m;
        t = new Thread(this, "Answer");
        t.start();
    }

    public void run() {
        for (int i = 0; i < s2.length; i++) {
            m.answer(s2[i]);
        }
    }
}

public class QuestionAnswer {
    public static void main(String[] args) {
        Chat m = new Chat();
        new Thread1(m);
        new Thread2(m);
    }
}
