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
class Gen<T>{
    T ob; //оголосити обєкт типу Т
    //передати конструктору посилання на обєкт типу Т
    Gen(T o){
        ob = o;
    }
    //повернути обєкт об
    T getob(){
        return ob;
    }
    //показати тип Т
    void ShowType(){
        System.out.println("Типом Т являється "+ob.getClass());
    }
}
public class GenDemo {
    public static void main(String args[]){
      //створити посилання типу Gen для цілих чисел
      Gen<Integer>iOb;
      iOb= new Gen<Integer>(88);
      iOb.ShowType();//показати тип 
      int v= iOb.getob();
      
       System.out.println("Значення: "+v+"\n");
       Gen<String> strOb=new Gen<String>("Тест узагальнень");
       strOb.ShowType();
       String str = strOb.getob();
       System.out.println("Значення: "+str);
           }
    
}
