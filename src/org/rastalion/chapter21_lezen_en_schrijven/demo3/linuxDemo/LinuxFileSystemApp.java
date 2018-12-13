package org.rastalion.chapter21_lezen_en_schrijven.demo3.linuxDemo;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.attribute.UserPrincipalLookupService;

public class LinuxFileSystemApp {
    public static void main (String[] args) {

       /*
       FileSystem is the factory for objects to
       access files and other objects in the file system.
        */
        FileSystem fsystem = FileSystems.getDefault();

       /*
       We can use the method getSeparator
       To see what separates the different
       parts of the path
        */
        System.out.println("Seperated by: " + fsystem.getSeparator() + "\n");

       /*
       Show me your roots baby
        */
        fsystem.getRootDirectories()
                .forEach(root -> System.out.println("Root: " + root));

       /*
       Or we can check if our system is readOnly
       Let them give you the method.
        */
        System.out.println("\nSystem is read only: " + fsystem.isReadOnly() + "\n");

       /*
       which are the supported Acces levels
        */
        System.out.println("Acces levels on root: ");
        fsystem.supportedFileAttributeViews()
                .forEach(System.out::println);

       /*
       Service to search the user
        */
        UserPrincipalLookupService usrLookup = fsystem.getUserPrincipalLookupService();

        try {
            //Look at this user bitches.
            System.out.println("\nCheck out this user: "
                    + usrLookup.lookupPrincipalByName("root"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
