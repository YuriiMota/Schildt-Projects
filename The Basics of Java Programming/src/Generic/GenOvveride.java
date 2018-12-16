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
class Gene<T>{
   T ob;
   Gene(T o){
       ob=o;
   }
   T getob(){
       return ob;
   }
   
}
class Gene2<T> extends Gene<T>{
    Gene2(T o){
        super(o);
    }
    T getob(){
        System.out.println("Метод getob Gene2 ");
        return ob;
    }
}
public class GenOvveride {
    public static void main(String args[]){
        Gene<Integer> iob = new Gene<>(88);
        Gene2<Integer> iob2 = new Gene2<>(21);
        Gene2<String> strob = new Gene2<>("Text");
        
        System.out.println(iob.getob());
        System.out.println(iob2.getob());
        System.out.println(strob.getob());
        

    }
}
