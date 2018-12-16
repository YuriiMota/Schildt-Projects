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
class MyGener<T>{
T i;
MyGener(T ob){
    i=ob;
}
T ret(){
    return i;
}
void  name (){
   
    System.out.println("Тип "+i.getClass().getName());
}
}
public class Mytest {
    public static void main(String args[]){
        MyGener<Integer> ob1 = new MyGener(23);
        System.out.println(ob1.ret());
        ob1.name();
        MyGener<Double> ob2 = new MyGener(23.4);
         System.out.println(ob2.ret());
         
         
        ob2.name();
        MyGener<String> ob3 = new MyGener("dsf");
         System.out.println(ob3.ret());
         
        ob3.name(); 
        
    }
}
