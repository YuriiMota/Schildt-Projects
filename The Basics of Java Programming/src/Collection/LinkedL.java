/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author Yura
 */
import java.util.LinkedList;
class Person{
     
    private String name;
    public Person(String value){
         
        name=value;
    }
    String getName(){return name;}
}
public class LinkedL {
    public static void main(String args[]){
        LinkedList<String> states = new LinkedList();
        //добавляємо ряд елементів
        states.add("Germany");
        states.add("France");
        states.add("Great Britain");
        states.add("Spaine");
        states.add(1,"Italy");
        System.out.printf("В списку %d елементів \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Denmark");
        states.removeFirst();
        states.removeLast();
        
        LinkedList<Person> people = new LinkedList<Person>();
        
        people.add(new Person("Mike"));
        people.add(new Person("Tom"));
        people.add(new Person("Nick")); 
        people.remove(1);
        
        for (Person P:people){
            System.out.println(P.getName());
        }
        Person first = people.getFirst();
          System.out.println(first.getName());
          
          
    }
}
