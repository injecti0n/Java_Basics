package org.rastalion.chapter21_lezen_en_schrijven.serializable.demo1;

import org.rastalion.chapter21_lezen_en_schrijven.serializable.demo1.entity.Car;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDateTime;

/**
 * Created by Mrrobot on 5/06/2018 javabasics-workspace.
 */
/*
Comments pas na de demo toevoegen
 */
public class ReadObjectApp {

    public static void main (String[] args) {

        try (FileInputStream file = new FileInputStream("MyFile.txt");
             ObjectInputStream in = new ObjectInputStream(file)){

            String text = (String) in.readObject();
            LocalDateTime time = (LocalDateTime) in.readObject();


            Car car = (Car) in.readObject();

            //ad this only after that you made both: Car and Jeep
//            Jeep jeep = (Jeep) in.readObject();

//            System.out.println(text);
//            System.out.println(time);


            System.out.println(car);

            //ad this only after that you made both: Car and Jeep
//            System.out.println(jeep);


        }catch (IOException | ClassNotFoundException io) {
            System.out.println("Oops something went wrong: " + io.getMessage());
        }

    }

}
