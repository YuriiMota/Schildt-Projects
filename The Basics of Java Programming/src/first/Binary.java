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
public class Binary {
 public static void main(String args[]){
     String Binary[]={"0000","0001","0010","0011",
                       "0100","0101","0110","0111",
                       "1000","1001","1010","1011",
                       "1100","1101","1110","1111"
     
     };
     int a=3; //0011
     int b=6; //0110
     int c= a|b;
     int d = a & b;
     int e = a^b;
     int f= (~a & b) | (a & ~b);
     int g= ~a & 0x0f;
     System.out.println("a= "+Binary[a]);
     System.out.println("b= "+Binary[b]);
     System.out.println("a|b= "+Binary[c]);
     System.out.println("a & b= "+Binary[d]);
     System.out.println("a^b= "+Binary[e]);
     System.out.println("~a&b | a&~b= "+Binary[f]);
     System.out.println("~a & 0x0f= "+Binary[g]);
     
     byte aa=109, bb;
     int i;
     i=aa<<2;
     bb=(byte)(aa<<2);
    System.out.println(i);
     System.out.println(bb);
 }   
}
