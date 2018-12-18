package core;
import java.util.Scanner;
import static java.lang.System.*;
class Person{
    String name;
    int age;
    {
        age = 13;
    }
    Person(){
        this("df",34);
    }
    /*Person(String name){
        this(name,34);
    }*/
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
}
interface Print{
     default void print(){
         System.out.println("ds");
     };
}
class PP implements Print{
    public void print(){
        System.out.println("dsd");
    }
}
public class Main {
     static int wp (int a){
        return a;
    }
    static int sum(double x, int y){

        return (int)x + y;
    }
    static double sum(int x, int y){

        return x + y;
    }
    static void form(){
        System.out.println("Opa");
    }
    public static void main(String[] args) {
        System.out.println("Hi Jack");
        int x=2940;
        double a=2334.5;
        byte b=(byte) x;
        double p=233242343;
        //wp(4);

        System.out.println(wp(4));
        Scanner sc = new Scanner(System.in);
        //int i = sc.nextInt();
        //String ff = sc.nextLine();
        //char c= sc.next().charAt(0);
       // System.out.println(c);
        //System.out.println(ff);
        Person Tom = new Person();
        out.println("Tom = " + Tom.age);
        form();
    }
}
