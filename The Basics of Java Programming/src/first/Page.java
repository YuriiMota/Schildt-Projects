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
class P{
   private int p1, p2, p3, p4;
    
    int max(int a, int b){
        if (a>b) return a;
        else return b;
    }
    int min(int a, int b){
        if (a<b) return a;
        else return b;
    }
    void Pages(int n, int p){
         p1=p;
         p2=(n-p)+1;
         if (p % 2 ==0){
             p3=p-1;
             p4=p2+1;
         }
         else{
             p3=p1+1;
             p4=p2-1;
         } 
         int maxi=max(max(p1,p2),max(p3,p4));
         int mini=min(min(p1,p2),min(p3,p4));
         System.out.println(maxi+" "+mini+" "+(mini+1)+" "+(maxi-1));
         
        
    }
}
public class Page {
    public static void main (String args[]){
        P book = new P();
        int Pages=1;
        int number=16;
        for (int i=1;i<=number;i++)
                book.Pages(number, i);
    }
    
}
