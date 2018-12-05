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
public class Wrap {
   public static void main (String args[]){
       try{
           int ii=100;
           int kk=ii;
           Integer iOb = new Integer("231");
   
       int i = iOb.intValue();
       System.out.println(i+ " "+iOb);
       Character c= 'd';
       char key= c;
       System.out.println(c+ " "+key);
       Boolean b = false;
       Boolean Boo = b;
       System.out.println(b+ " "+Boo);
       Integer a=2;
       switch(a){
           case 1: System.out.println("One");
           break;
           case 2: System.out.println("Two");
           break;
           default: System.out.println("Eror");
           
           
       }
       System.out.println();
       }catch(NumberFormatException e){
          System.out.println("Невірні дані "+ e); 
         
       }
   } 
}
