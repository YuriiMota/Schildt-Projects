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
public class if_else {
  public static void main (String args[]){
      int a=1;
      String season;
      System.out.println("if-else");
      if (a==12 || a==1 || a==2) season= "winter";
      else if (a==3 || a==4 || a==5) season= "spring";
      else if (a==6 || a==7 || a==8) season= "summer";
      else if (a==9 || a==10 || a==11) season= "autumn";
      else season= "No";
      System.out.println(season);

      System.out.println("Case");
  for(int i=1;i<13;i++)
  switch(i){
      case 1:
      case 2:
      case 12:
      System.out.println("winter");
      break;
      case 3:
      case 4:
      case 5:
      System.out.println("spring");
      break;
      case 6:
      case 7:
      case 8:
      System.out.println("summer");
      break;     
      case 10:
      case 11:
      case 9:
      System.out.println("autumn");
      break;
      default :System.out.println("Nema"); 
  
  }
}
}