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
public class First {

       public static void main (String[] args){
        
      
      // int M[][]=new int[4][5];
       int i,j,k;
     /*   for(i=0;i<4;i++){
          for(j=0;j<5;j++){
        M[i][j]=i;
            System.out.print(M[i][j]+" ");
           
          } System.out.println(); 
           }*/
        
        int Mas [][]= new int [4][];
        Mas[0]= new int[1];
        Mas[1]= new int[2];
        Mas[2]= new int[3];
        Mas[3]= new int[4];
        for(i=0;i<4;i++) 
        {
          for(j=0;j<i+1;j++){
        Mas[i][j]=i;
            System.out.print(Mas[i][j]+" ");
           
          } System.out.println(); 
           }
        System.out.println("Mas#2");
        int F[][]={
            { 1,3,4 },
             {2,5,6},
             {3,2+2,5}};
        for(i=0;i<3;i++) 
        {
          for(j=0;j<3;j++){
            System.out.print(F[i][j]+" ");
           
          } System.out.println(); 
           }
      //_________________________
      
        System.out.println("Mas#2");
        
        int TreeM[][][] = new int [3][4][5];
         for (i=0;i<3;i++){
             for (j=0;j<4;j++){
                 for (k=0;k<5;k++){
                     TreeM[i][j][k]=i*j*k;
               System.out.print(TreeM[i][j][k]+"   ");
         }
         System.out.println();
         }System.out.println();
         }
}}
