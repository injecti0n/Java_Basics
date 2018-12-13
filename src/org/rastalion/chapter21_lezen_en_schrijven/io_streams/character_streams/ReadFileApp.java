package org.rastalion.chapter21_lezen_en_schrijven.io_streams.character_streams;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileApp {

    public static void main (String[] args) {

        //we can use the try with resources to ensure that stream is closed.
        try (FileReader file = new FileReader("MyTextFile.txt")) {
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
