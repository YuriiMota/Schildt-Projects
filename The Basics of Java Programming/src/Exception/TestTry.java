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
public class TestTry {
    public static void main(String args[]){
        try{
            int a= 1;
            int b=42/a;
            System.out.println("a= "+a);
            try{
                if(a==1) throw new Exception("Ділення на нуль ");//a=a/(a-a);
                if(a==2) {
                    int c[]={1};
                    c[42]=99;
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Помилка індексації за межами масиву: "+e);
            }
        }catch(Exception e){
           System.out.println("Помилка: "+e); 
        }
        
        System.out.println("END!");
    }
}
