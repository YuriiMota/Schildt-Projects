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
class Get<T>{
   T ob;
   Get(T o){
       ob=o;
   }
   T getob(){
       return ob;
   }
}

public class RawDemo {
    public static void main(String args[]){
        Get<Integer>iob = new Get<Integer>(88);
        Get<String>iob2 = new Get<String>("Text");
        Get raw = new Get(new Double (23.6));
        
        double d = (Double) raw.getob();
        System.out.println(d);
        
        
    } 
}
