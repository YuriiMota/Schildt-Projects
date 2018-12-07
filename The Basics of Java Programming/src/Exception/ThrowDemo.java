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
public class ThrowDemo {
   static void demoproc() {
       try{
         throw new NullPointerException("Демонстрація");  
       }catch(NullPointerException e){
          System.out.println("Виключення перехоплено в тілі метотоду demoproc ");
          throw e;
       }
   }
   public static void main(String args[]){
       try{
         demoproc();  
       }catch (NullPointerException e){
         System.out.println("Повторне перехоплення "+e);  
       }
           
   }
}
