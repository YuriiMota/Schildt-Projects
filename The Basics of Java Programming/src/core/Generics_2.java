package core;
class Printer{
    public <T> void print(T[]items){
        for(T i:items){
            System.out.println(i);
        }

    }
}
public class Generics_2 {
    public static void main(String[]args){
Printer ob1 = new Printer();
Integer[] m1 = {1,2,4,5};
String[] m2 = {"dsd","dsdsd","sdsd","sdfs"};
ob1.<Integer>print(m1);
ob1.<String>print(m2);
    }
}
