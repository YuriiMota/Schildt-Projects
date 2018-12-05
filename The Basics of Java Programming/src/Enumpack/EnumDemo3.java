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
enum Apples{
    Jonathan(10), GoldenDel(9),RedDel(12), Winesapp(15), Cortland;
    private int price;
    //Конструктор
    Apples (int p){
    price=p;    
    }
    Apples (){
    price=-1;    
    }
    int getPrice(){
        return price;
    }
}
public class EnumDemo3 {
     public static void main (String args[]){
       Apples ap;
       System.out.println("Вивести ціну на яблуко сорту Cortland - "+Apples.Cortland.getPrice()+" cent");
       //вивести ціни на всі сорти яблук
       System.out.println("Ціна на всі сорти яблук");
       for (Apples a: Apples.values()){
           System.out.println(a+"= "+a.getPrice()+" cent");
       }
     }   
}
