/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumpack;

/**
 *
 * @author Yura
 */
// методи ordinal, compareTo, equals

public class EnumDemo5 {
  public static void main (String args[]){
      Apple ap, ap2,ap3;
      //отримати всі порядкові значення методом ordinal
      for(Apple a: Apple.values())
           System.out.println(a+"  "+a.ordinal());
     // System.out.println(Apple.Jonathan.ordinal());
     ap=Apple.RedDel;
     ap2=Apple.GoldenDel;
     ap3=Apple.RedDel;
      System.out.println(ap.compareTo(ap2));
      System.out.println(ap.compareTo(ap3));
      System.out.println(ap2.compareTo(ap));
    if (ap.compareTo(ap2)<0)
        System.out.println(ap+"передує"+ap2);   
    if (ap.compareTo(ap2)>0)
        System.out.println(ap2+" передує "+ap);
    if (ap.compareTo(ap3)==0)
        System.out.println(ap3+" рівне "+ap+"\n");
    
    System.out.println(ap.equals(ap2));
      System.out.println(ap.equals(ap3));
      System.out.println(ap2.equals(ap));
    
  }  
}
