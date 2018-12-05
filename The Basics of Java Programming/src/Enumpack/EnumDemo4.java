/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumpack;

/**
 *
 * @author Yura
 */
enum Firm{
    Eco("Петрушко",4), Puma("Petrenko",6),Adidas();
    private  String surname;
    private int year;
    Firm(String s,int n){
      surname=s;
      year=n;
    }
    Firm(){
      surname="Диреткора фірми не вказано";
      year=0;
    }
    
    String sn(){
        return surname;
    }
    int kyear(){
        return year;
    }
}
public class EnumDemo4 {
    public static void main (String args[]){
     //   Firm f;
        System.out.println("директор адідасу - "+Firm.Adidas.sn());
        for (Firm a: Firm.values())System.out.println("Назва фірми - "+a+" Директор фільми - "+a.sn()+" Фірмі років - "+a.kyear()); 
    }
}
