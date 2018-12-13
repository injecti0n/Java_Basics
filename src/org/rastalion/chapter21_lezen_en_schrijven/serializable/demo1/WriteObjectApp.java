package org.rastalion.chapter21_lezen_en_schrijven.serializable.demo1;

import org.rastalion.chapter21_lezen_en_schrijven.serializable.demo1.entity.Car;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

/**
 * Created by Mrrobot on 5/06/2018 javabasics-workspace.
 */
/*
Comments pas na de demo toevoegen
 */
public class WriteObjectApp {
    public static void main (String[] args) {
        String text = "this is some text";
        LocalDateTime date = LocalDateTime.now();

        Car nissan = new Car("Nissan", 1200, 1.5);

        //ad this only after that you made both: Car and Jeep
//        Jeep jeep = new Jeep("Hummer",4000,1.6, true);

        try (FileOutputStream file = new FileOutputStream("MyFile.txt");
             ObjectOutputStream out = new ObjectOutputStream(file)) {

            out.writeObject(text);
            out.writeObject(date);

            //won't work until we implement the marker interface Serializable
            out.writeObject(nissan);

            //ad this only after that you made both: Car and Jeep
//            out.writeObject(jeep);

        } catch (IOException io) {
            System.out.println("Oops something went wrong: " + io.getMessage());
        }
    }

}
