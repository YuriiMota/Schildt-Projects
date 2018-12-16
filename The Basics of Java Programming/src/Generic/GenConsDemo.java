/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author Yura
 */
class GenCons{
    private double val;
    <T extends Number> GenCons(T arg){
        val=arg.doubleValue();
    }
    void show(){
        System.out.println("Val = "+val);
    }
}
public class GenConsDemo {
    public static void main(String args[]){
        GenCons test = new GenCons(12);
        GenCons test2 = new GenCons(123.5F);
        test.show();
        test2.show();
        
    }
}
