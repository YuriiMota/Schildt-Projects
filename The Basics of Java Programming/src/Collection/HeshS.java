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
import java.util.HashSet;
public class HeshS {
    public static void main(String args[]){
        HashSet<String> pers= new HashSet();
        pers.add("Djo");
        pers.add("Jack");
        pers.add("Jim");
        pers.add("Djo");
        pers.add("Rufi");
        pers.add("Rusty");
        for(String S:pers){
            System.out.println(S);
        }
    }
}
