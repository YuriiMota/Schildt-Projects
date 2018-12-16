/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author Yura
 */
public class GenMethDemo {
    static<T extends Comparable<T>, V extends T> boolean isin (T x, V[] y ){
        for (int i=0;i<y.length;i++)
            if (x.equals(y[i])) return true;
        return false;
    }
 public static void main(String args[]){
     Integer nums[]={1,2,3,4,5};
     if(isin(2,nums)) 
         System.out.println("Number 2 in array");
     if(!isin(7,nums)) 
         System.out.println("Number 7 no in array \n");
     String str[]={"one","two","three","foure"};
        if(isin("one",str)) 
         System.out.println("Yes");
        if(!isin("ololo",str)) 
         System.out.println("No");
 }       
}
