/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;
import java.util.Random;
/**
 *
 * @author Yura
 */
public class Length {
   public static void main(String args[]){
       int a1[] = new int [10];
       int a2[] = {3,5,6,7,8};
       int a3[]={-2,-4};
      Random ae = new Random();
      for (int i=0;i<10;i++){
          
     a1[i]=(int)(ae.nextInt(10));
          System.out.println(a1[i]); 
      }
    //   System.out.println(a1.length);
     //  System.out.println(a2.length);
    //   System.out.println(a3.length);
     //  System.out.println(ae);
       
   } 
}
