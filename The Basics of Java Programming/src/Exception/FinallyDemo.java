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
public class FinallyDemo {
    //згенерувати виключення в методі
    static void procA() {
     try{
    System.out.println("В тілі методу procA");
    throw new RuntimeException("Демонстрація");
}finally {
  System.out.println("Блок оператора finally в методі procA");  
}  
    }
    //повернути управління з блоку оператора try
    static void procB(){
     try{
    System.out.println("В тілі методу procB");
    return;
}finally {
  System.out.println("Блок оператора finally в методі procB");  
}  
    }
    //виконати блок try як звичайно
    static void procC(){
     try{
   System.out.println("В тілі методу procC");
    }finally  {
  System.out.println("Блок оператораfinally в методі procC");  
}  
    }
    public static void main (String args[]){
        try{
            procA();
        }catch(Exception e){
         System.out.println("Перехоплено");   
        }
        procB();
        procC();
    }
}
