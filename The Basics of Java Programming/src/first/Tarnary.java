/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

/**
 *
 * @author Yura
 */
public class Tarnary {
    public static void main (String args[]){
        int i,k;
        i=10;
        k= i<10 ? -i: i;
        System.out.println("Значення при +10= "+k);
        i=-10;
        k= i<10 ? -i : i;
        System.out.println("Значення при -10= "+k);

    }
}
