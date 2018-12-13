package org.rastalion.chapter21_lezen_en_schrijven.serializable.demo2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

/**
 * Created by Mrrobot on 5/06/2018 javabasics-workspace.
 */
public class Maternity {

    public static void main (String[] args) {

        PersonHeartbeat person = new PersonHeartbeat("Alex","Keisse",
                LocalDate.of(1989,03,16));

        try (FileOutputStream file = new FileOutputStream(person.getFirstName() + ".txt");
             ObjectOutputStream out = new ObjectOutputStream(file)){

            out.writeObject(person);

            while (true) {

            }
        } catch (IOException e) {
            System.out.println("Oops this went wrong: " + e.getMessage());
        }

    }

}
