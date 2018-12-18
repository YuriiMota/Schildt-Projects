package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serializable_2 {
    public static void main(String[]args){
        String filename = "people.dat";
        ArrayList<Person_1> people = new ArrayList<Person_1>();
        people.add(new Person_1("bob",23,134.2,true));
        people.add(new Person_1("Sam",22,188.2,false));
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            oos.writeObject(people);
            System.out.println("File has been writen");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        ArrayList<Person_1> newPeople = new ArrayList<Person_1>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {
            newPeople=((ArrayList<Person_1>) ois.readObject());
            System.out.println("File has been read");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        for (Person_1 p: newPeople){
            System.out.println(p.getName());
            System.out.println(p.getAge());
            System.out.println(p.getHeight());
            System.out.println(p.getMarried());
        }

    }
}
