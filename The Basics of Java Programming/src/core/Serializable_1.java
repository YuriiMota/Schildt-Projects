package core;

import java.io.*;

class Person_1 implements Serializable{
    private String name;
    private int age;
    private transient double height;
    private transient boolean married;
    Person_1(String n, int a, double h, boolean m){

        name=n;
        age=a;
        height=h;
        married=m;
    }
    String getName() {return name;}
    int getAge(){ return age;}
    double getHeight(){return height;}
    boolean getMarried(){return married;}
}

public class Serializable_1 {
    public static void main(String[]args){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat")))
        {
            Person_1 P = new Person_1("Bob",24,186.3,true);
            oos.writeObject(P);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat")))
        {
            Person_1 P = (Person_1) ois.readObject();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
