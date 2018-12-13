package org.rastalion.chapter21_lezen_en_schrijven.io_streams.character_streams;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileApp {

    public static void main (String[] args) {

        FileWriter file = null;
        try {
            //Creating a FileWriter obj can give a IOException
            file = new FileWriter("MyTextFile.txt");
            //So does the write method.
            file.write("Hello");
            file.write("World");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            //very important to make sure this Stream is closed.
            try {
                if (file != null) {
                    //this method can give a IOException.
                    file.close();
                }
            } catch (IOException e) {
                //This seems a bit difficult why not use try with resources.
                //try (Type name = new Type()) {
                System.err.println("Error closing a file.");
            }
            System.out.println("Job done, no problem sir.");
        }

    }

}
