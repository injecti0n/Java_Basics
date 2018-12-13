package org.rastalion.chapter21_lezen_en_schrijven.io_streams.byte_steams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputStreamApp {

    public static void main (String[] args) throws FileNotFoundException {

        /*
        Properties
         */
        String sourceFileName = "input.txt";
        String destFileName = "output.txt";

        /*
        Can throw FileNotFoundException
         */
        java.io.FileOutputStream out = new java.io.FileOutputStream(sourceFileName);

        /*
        Using a try with resources
        Closes the resources automatically
         */
        try (FileInputStream in = new FileInputStream(destFileName)) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("Data is taken from: " + sourceFileName + " and put in: " + destFileName);

        } catch (IOException e) {
            System.out.println("Look like a IO Exception to me");
            System.out.println(e.getMessage());
        }

    }

}
