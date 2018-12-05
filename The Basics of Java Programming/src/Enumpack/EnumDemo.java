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
enum Apple{
   Jonathan, GoldenDel,RedDel, Winesapp, Cortland 
}
public class EnumDemo {
   public static void main (String args[]){
       Apple ap;
       ap=Apple.RedDel;
       //вивести значення перелічувального типу
       System.out.println("Значення ap- "+ap);
       System.out.println();
       
       ap=Apple.GoldenDel;
       //порівняти два значення перечислювального типу
       if (ap==Apple.GoldenDel)
           System.out.println("Змінна ар вміщає GoldenDel.\n");
       // для управління свіч
       switch(ap){
           case Jonathan:
              System.out.println("Сорт Джонатан червоний");
              break;
           case GoldenDel:
              System.out.println("Сорт Golden del yellow");
              break; 
           case RedDel:
              System.out.println("Сорт RedDel red");
              break;
           case Winesapp:
              System.out.println("Сорт Winesapp red");
              break;
           case Cortland:
              System.out.println("Сорт Cortland -  red");
              break;
       }
   } 
}
