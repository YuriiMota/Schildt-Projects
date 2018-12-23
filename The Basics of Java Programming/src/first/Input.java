/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

/**
 *
 * @author Yura
 */
import java.util.Scanner;
public class Input {
  public static void main(String args[]){
      int i;
      String str;
      double d;
      char c;
      Scanner sci = new Scanner(System.in);
       Scanner scstr = new Scanner(System.in);
        Scanner scd = new Scanner(System.in);
         Scanner scc = new Scanner(System.in);
      System.out.println("Введіть число");
      if(sci.hasNextInt()){
      i=sci.nextInt();
      System.out.println(i);}
      else System.out.println("Eror");
      
      
      System.out.println("Введіть дробове");
      d=scd.nextDouble();
      System.out.println(d);
      System.out.println("Введіть рядок");
      str=scstr.nextLine();
      System.out.println(str);
      
  }  
}
