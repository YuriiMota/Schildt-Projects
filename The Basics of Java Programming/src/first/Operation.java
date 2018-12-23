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
public class Operation {
    public static void main (String args[]) {
     /* int a= 1+1;
      int b=a*3;
      int c=b/4;
      int d=c-a;
      int e=-d;
      
      System.out.println(a);
       System.out.println(b);
        System.out.println(c);
         System.out.println(d);
          System.out.println(e);
          
          double da= 1+1;
      double db=da*3;
      double dc=db/4;
      double dd=dc-a;
      double de=-dd;
      
      System.out.println(da);
       System.out.println(db);
        System.out.println(dc);
         System.out.println(dd);
          System.out.println(de);
          */
     int a=678;
     int aa,c,d;
     boolean tr=true;
     a+=3;
     double b=1542.25;
     aa=(int)(a/100) ;
     c=(int)(a / 10) %10 ;
     d= 51 % 6;
     System.out.println("X mod 10= "+aa+" "+c+" "+" "+d);
     System.out.println("X mod 10= "+b % 10);
     System.out.println("_________");
    
     int k=1;
     int l=2;
     int m;
     int n;
     m=++l;
     n=k++;
     m++;
     System.out.println(k+" "+l+" "+m+" "+n);
    }
}
