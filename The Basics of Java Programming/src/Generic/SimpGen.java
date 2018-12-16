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
class TwoGen<T,V>{
    T ob1;
    V ob2;
    TwoGen(T o1,V o2){
        ob1 =o1;
        ob2=o2;
    }
    void showTypes(){
         System.out.println("Тип Т "+ob1.getClass().getName());
          System.out.println("Тип V "+ob2.getClass().getName());
    }
    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }
}
public class SimpGen {
     public static void main(String args[]){
         TwoGen<Integer,String> tgOb= new TwoGen(23,"Узагальнення");
         tgOb.showTypes();
         int v = tgOb.getOb1();
         System.out.println("Значення: "+v);
         String str = tgOb.getOb2();
         System.out.println("Значення: "+str);
         
     }
}
