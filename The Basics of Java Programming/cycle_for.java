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
public class cycle_for {
  public static void main (String args[]) {
     float a=0,b=10,h=0.5f;
     float x,y;
     x=a;
     do {
         y=(x+1)/2;
         System.out.println(x+"\t"+y);
         x+=h;
     } while (x<=b);
  } 
}
