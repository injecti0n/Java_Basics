package org.rastalion.chapter21_lezen_en_schrijven.serializable.demo2;

import java.io.*;

/**
 * Created by Mrrobot on 5/06/2018 javabasics-workspace.
 */
public class CivilService {

    public static void main (String[] args) {

        try (FileInputStream file = new FileInputStream("alex.txt");
             ObjectInputStream in = new ObjectInputStream(file)){

            PersonHeartbeat person = (PersonHeartbeat) in.readObject();

            while (true) {

            }

        }catch (IOException | ClassNotFoundException io) {
            System.out.println("Oops something went wrong: " + io.getMessage());
        }

    }

}
