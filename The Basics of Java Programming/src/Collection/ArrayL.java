/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;
import java.util.ArrayList;

public class ArrayL {
    public static void main(String args[]){
        ArrayList<String> states = new  ArrayList<String>();
        states.add("Italy"); //додаєм обєкт в колекцію
        states.add("Germany");
        states.add("Spaine");
        states.add("France");
        states.add(1, "Ukraine");
       //  states.clear(); видаляємо всі елементи
        
            if (states.contains("Poland")) System.out.println("Yes"); 
                else  System.out.println("No"); //первіряємо чи обєкт є в колекції
        System.out.println(states.get(0)); // повертає обєкт зі списку по індексу
       
        states.set(0, "Denmark");  //встановлюємо значення
        System.out.println(states.get(0)); 
        System.out.printf("Розмір колекції %d \n",states.size()); //розмір колекції
         for(String S: states){
             System.out.println(S);} //виводимо всі значення
        states.remove("France");
        states.remove(0); //видаляємо обєкти з колекції
             System.out.println("New Collection");
         Object countries[] = states.toArray();
         for(Object S1: countries){
             System.out.println(S1);
         }
         
    } 
}
