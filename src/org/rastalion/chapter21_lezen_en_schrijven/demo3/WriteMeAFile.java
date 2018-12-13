package org.rastalion.chapter21_lezen_en_schrijven.demo3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class WriteMeAFile {
    /*
    Make sure that you are in the folder C:\data\folder1
    Delete all existing files in there first.
     */
    public static void main (String[] args) {

        try {
            //Define the path
            Path path = Paths.get("C:\\Data\\folder1\\testing.txt");

            //Create parent directories
            checkIfDirExistElseCreate(path);

            //Create file if not existing
            checkIfFileExistElseCreate(path);

            //Write lines of text to the file
            writeSomeLinesToFile(path);

            //Read the file if it exist.
            Files.lines(path).forEach(System.out::println);

            //Copy the file
            Files.copy(path,
                    Paths.get("C:\\Data\\folder1\\testing2.txt"));
            System.out.println("Copy is created.");

            //Delete if the file exist.
//            String feedback = (Files.deleteIfExists(path)) ? "deleted." : "non existing.";
//            System.out.println("The file is " + feedback);

            /*
            Let's read the attributes of our file.
             */
            readFileAttributes(path);

        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }

    }//Here the main has ended!!

    /*
    This is not in original demo add this in the section file attributes.
     */
    private static void readFileAttributes (Path path) throws IOException {
        if (path != null) {
            System.out.println("test");
            BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);

            System.out.println("creationTime: " + attr.creationTime());
            System.out.println("lastAccessTime: " + attr.lastAccessTime());
            System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

            System.out.println("isDirectory: " + attr.isDirectory());
            System.out.println("isOther: " + attr.isOther());
            System.out.println("isRegularFile: " + attr.isRegularFile());
            System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
            System.out.println("size: " + attr.size());
        }
    }

    private static void writeSomeLinesToFile (Path path) throws IOException {
        List<String> lines = new ArrayList<>();
        lines.add("Hello");
        lines.add("World");
        lines.add("How");
        lines.add("you");
        lines.add("doing");
        lines.add("?");

       /*
       StandardOpenOption.APPEND ctrl + click on it ;)

	  Charset.defaultCharset returns the default charset of this 	  Java virtual machine
        */
        Files.write(path, lines,
                Charset.defaultCharset(), StandardOpenOption.APPEND);
    }

    private static void checkIfFileExistElseCreate (Path path) throws IOException {
        if (Files.notExists(path)) {
            Files.createFile(path);
            System.out.println("File is created.");
        } else {
            System.out.println("File already exist.");
        }
    }

    private static void checkIfDirExistElseCreate (Path path) throws IOException {
        if (Files.notExists(path.getParent())) {
            Files.createDirectories(path.getParent());
            System.out.println("Dir is created.");
        } else {
            System.out.println("Dir already exist.");
        }
    }

}
