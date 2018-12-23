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
public class break_goto {
  public static void main (String args[]){
      boolean t = true;
      int k[][]={{1,2,3},
          {4,5,6},{7,8,9}};
      
      int i,j;
      a: for ( i=0;i<3;i++){ ;
          b:    for ( j=0;j<3;j++)
              if (k[i][j]==4) break b;
          else
               System.out.print(k[i][j]+" ");
           System.out.println();
  }
      
  }  
  
}
