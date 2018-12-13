package org.rastalion.chapter21_lezen_en_schrijven.demo2;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.attribute.UserPrincipalLookupService;

public class FileSystemApp {
    public static void main (String[] args) {

        FileSystem fsystem = FileSystems.getDefault();

        System.out.println("Seperated by: " + fsystem.getSeparator() + "\n");

        fsystem.getRootDirectories()
                .forEach(root -> System.out.println("Root: " + root));

        System.out.println("\nSystem is read only: " + fsystem.isReadOnly() + "\n");

        System.out.println("Acces levels on root: ");
        fsystem.supportedFileAttributeViews()
                .forEach(System.out::println);

        UserPrincipalLookupService usrLookup = fsystem.getUserPrincipalLookupService();

        try {
            System.out.println("\nCheck out this user: "
                    + usrLookup.lookupPrincipalByName("keisse.alexander@hotmail.com"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
