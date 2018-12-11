/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Yura
 */
public class TreeS {
    public static void main(String[] args) {
         
        TreeSet<String> states = new TreeSet<String>();
         
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("GB");
       
        System.out.printf("В списку %d елментів \n", states.size());
         
        //states.remove("Germany");
        for(String state : states){
            System.out.println(state);}
            //System.out.println(states.first());
            //System.out.println(states.last());
            SortedSet<String> set = states.subSet("France", "Italy");
            System.out.println(set);
         NavigableSet<String> navSet = states.descendingSet();//в іншому порядку
    }
}
