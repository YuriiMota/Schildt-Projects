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
public class offset {
        public static void main (String args[]){
  char hex[]= {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
  byte  b =(byte) 0xf1;
  System.out.println("b=0x"+hex[(b>>4) & 0x0f]+hex[b& 0x0f]);

 byte  n=-1;
 n=(byte) (n >>> 4);
 System.out.println(n);
 //_________________________________ 
  char hex1[]= {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
  byte  b1 =(byte) 0xf1;
  byte  c1 =(byte) (b>>4);
  byte  d1 =(byte) (b>>>4);
  byte  e1 =(byte) ((b&0xff)>>4);
  System.out.println("b=0x"+hex[(b1>>4) & 0x0f]+hex[b1& 0x0f]);
  System.out.println("c>>=0x"+hex[(c1>>4) & 0x0f]+hex[c1& 0x0f]);
   System.out.println("d1>>0x="+hex[(d1>>4) & 0x0f]+hex[d1& 0x0f]);
    System.out.println("e1>>0x="+hex[(e1>>4) & 0x0f]+hex[e1& 0x0f]);
    //______________________
    int aa=1;
    int bb=2;
    int cc=3;
    aa|=4;
    bb>>=1;
    cc<<=1;
    aa^=cc;
    System.out.println(aa);
    System.out.println(bb);
    System.out.println(cc);
            
 }
        
}
