package com.javaconcepts.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 23/03/17
 * Time: 6:54 AM
 * https://www.tutorialspoint.com/java/io/bufferedreader_readline.htm
 */
public class ReadLine {
    private static final String FILENAME = "src/com/javaconcepts/bufferedreader/read.txt";
    public static void main(String[] args) throws Exception {
        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader(FILENAME));

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }
}
