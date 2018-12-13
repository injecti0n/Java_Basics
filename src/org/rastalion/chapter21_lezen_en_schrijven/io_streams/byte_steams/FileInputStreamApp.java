package org.rastalion.chapter21_lezen_en_schrijven.io_streams.byte_steams;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Mrrobot on 4/06/2018 javabasics-workspace.
 */
public class FileInputStreamApp {

    public static void main (String[] args) {

        //we can use the try with resources to ensure that stream is closed.
        try (FileInputStream file = new FileInputStream("Lyrics.txt")) {
            //We will take the int value of a char in text file
            int character;
            while ((character = file.read()) != -1) {
                //We need to cast or it will print the int values.
                System.out.print((char) character);
            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }

    }

}
