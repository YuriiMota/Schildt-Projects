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
public class MultyCatch {
    public static void main (String args[]){
        int a = 10, b=0;
        int m[]={1,2,3};
        try{
            int result=a/b;
            m[10]=19;
            
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
          System.out.println("Першопречина "+e);  
        }
    }
    
}
