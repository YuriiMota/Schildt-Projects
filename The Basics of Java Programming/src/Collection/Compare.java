/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.TreeSet;

/**
 *
 * @author Yura
 */
class Person1 implements Comparable<Person1>{
     
    private String name;
    public Person1(String value){
         
        name=value;
    }
    String getName(){return name;}
    public int compareTo(Person1 P){
        return name.compareTo(P.getName());
    }
}
public class Compare {
    public static void main(String args[]){
    TreeSet<Person1> people = new TreeSet<Person1>();
people.add(new Person1("Tom"));
people.add(new Person1("Pucho"));
people.add(new Person1("Jo"));
people.add(new Person1("A"));
for(Person1 P: people){
    System.out.println(P.getName());
}
}
}