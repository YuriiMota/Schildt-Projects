package core;

import java.io.File;
import java.io.IOException;

public class Catalog_work {
    public static void main(String[]args) {
        File dir = new File("C://Somedir//newDir");
        boolean created = dir.mkdir();
        if(created) System.out.println("Folder has been created");
        File newDir= new File("C://Somedir//NewDirRenamed");
        dir.renameTo(newDir);
        boolean delete = newDir.delete();
        if(delete)
            System.out.println("Folder has been deleted");
            File myFile = new File("C://Somedir//file.txt");
        System.out.println("new file "+myFile.getName());
        System.out.println("parent catalog "+myFile.getParent());
        if (myFile.exists())
            System.out.println("File exists");
        else
            System.out.println("File not found");
        System.out.println("File size"+myFile.length());
        if(myFile.canRead())
            System.out.println("File can be read");
        else
            System.out.println("File can not be read");

        if(myFile.canWrite())
            System.out.println("File can be written");
        else
            System.out.println("File can not be written");

    //створити новий файл
    File newFile = new File("C://SomeDir//MyFile.txt");
        try
    {
        boolean created1 = newFile.createNewFile();
        if(created1)
            System.out.println("File has been created");
    }
        catch(IOException ex){

        System.out.println(ex.getMessage());
    }
}}
