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
class MyException extends Exception{
    private int detail;
    MyException(int a){
        detail=a;
    }
    public String toString(){
        return "My Exception ["+detail+"]";
    }
}
public class ExceptionDemo {
    static void compute(int a) throws MyException{
        System.out.println("Викликаний метод compute("+a+")");
        if (a>10) 
            throw new MyException(a);
        System.out.println("Нормальне завершення");
    }
     public static void main (String args[]){
         try{
             compute(1);
             compute(20);
         }catch(MyException e){
           System.out.println("Перехоплено виключення"+e);  
         }
     }
}
