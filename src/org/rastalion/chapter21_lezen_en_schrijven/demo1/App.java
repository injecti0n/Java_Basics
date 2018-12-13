package org.rastalion.chapter21_lezen_en_schrijven.demo1;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main (String[] args) {

       /*
       We use the factory method here:  https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
       to create an instance of Path
        */
        Path p1 = Paths.get("C:\\data");

       /*
       We can move inside this path with the method
       resolve
        */
        Path p2 = p1.resolve("folder1");

       /*
       Return type of the resolve method
       is therefore a Path obj
        */
        Path p3 = p2.resolve("testing.txt");


       /*
       Method chaining for the win!
        */
        Path p4 = p1.resolve("folder2")
                .resolve("zekergeenwachtwoord.txt");

       /*
       We can now calculate the relative
       path between 2 paths.
        */
        Path p7 = p3.relativize(p4);
        System.out.println("The relative path from p3 to p4: " + p7);

        /*
       We can check if our path is an
       absolute path by using the method
       isAbsolute() on it.
        */
        isAbsolutePath(p1);
        isAbsolutePath(p2);
        isAbsolutePath(p3);

        /*
        This is the way you can check if the path points to a real file
         */
        File file = p3.toFile();
        System.out.println("P3 is a file: " + file.isFile());

       /*
       Ooooooeeeeeh what the...
        */
        try {
            /*
            We take a obviously wrong path
             */
            Path path = Paths.get("e:\\DAta\\foLder\\s3cr3tP0rnS4nt4");
            System.out.println("The root is: " + path.getRoot());
            System.out.println("Filename: " + path.getFileName());
            System.out.println("Get parent paths:" + path.getParent());

            System.out.println("\nOw boiiiii, we have the foreach method\n" +
                    "Up yours for loop");

            path.forEach(System.out::println);
        } catch (Exception ipe) {
            System.out.println(ipe.getMessage());
        }
    }

    /*
    Private helper method to avoid duplicate code
    Checks if the path is an absolute path.
     */
    private static void isAbsolutePath (Path p) {
        System.out.println(p.getFileName() + " is an absolute path: "
                + p.isAbsolute());
    }

}
