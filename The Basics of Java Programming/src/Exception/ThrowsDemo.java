/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Yura
 */
public class ThrowsDemo {
    static void throwsOne() throws IllegalAccessException {
        System.out.println("В тілі методу throwOne");
        throw new IllegalAccessException("Демонстрація");
    }
    public static void main (String args[]){
      try{
          throwsOne();
      }catch(IllegalAccessException e) {
        System.out.println("В тілі методу main " +e );  
      }
    }
    
}
