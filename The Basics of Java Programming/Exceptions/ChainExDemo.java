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
public class ChainExDemo {
    static void demoProc(){
      //ствоирит виключиння
      NullPointerException e= new NullPointerException("верхній рівень");
      e.initCause(new ArithmeticException("причина"));
      throw e;
    }
      public static void main (String args[]){
          try{
              demoProc();
          }catch(NullPointerException e){
              System.out.println("Перехоплено виключення"+e);
              System.out.println("Першопречина"+e.getCause());
          }
      }
              
    } 

