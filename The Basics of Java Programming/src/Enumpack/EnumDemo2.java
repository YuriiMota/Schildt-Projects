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
public class EnumDemo2 {
    public static void main (String args[]){
       Apple ap;
       System.out.println("Константи перерахункового типу ар");
       Apple allaple[]=  Apple.values();
       for (Apple a: allaple)
          System.out.println(a);    
       System.out.println();
       // Метод valueOf
       String S= "Winesaspp";
       try{
        ap=Apple.valueOf(S);
    
       
        System.out.println("Значення ap- "+ap);
       }catch(Exception e){
      System.out.println(e); 
    }
    }
}