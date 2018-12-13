package org.rastalion.chapter21_lezen_en_schrijven.io_streams.character_streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Mrrobot on 3/06/2018 javabasics-workspace.
 */

/*
Make sure when you do this demo that you have a textFile named: MyTextFile.txt
And it has multiple lines of text in it.
 */
public class BufferedReaderApp {

    public static void main (String[] args) {

        //we can use the try with resources to ensure that stream is closed.
        try (FileReader file = new FileReader("Lyrics.txt");
             BufferedReader reader = new BufferedReader(file)) {
            //We will take the int value of a char in text file
            String line = null;
            while ((line = reader.readLine()) != null) {
                //We need to cast or it will print the int values.
                if (line.trim().equals("")) {
                    line = "\n\t\t\t\t\t\t\t\t*** Ooooh whitespace ***\n";
                }
                System.out.println(line);
            }
        } catch (IOException io) {
            System.out.println("Oops something went wrong");
            System.out.println(io.getMessage());
        }
        System.out.println("Job is done.");

    }
}
