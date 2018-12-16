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
class NonGen{
    Object ob;
    NonGen(Object o){
        ob=o;
    }
    Object getOb(){
        return ob;
    }
    void ShowType(){
        System.out.println("Обєкт об відносяться до типу "+ob.getClass().getName());
        
    }
}
public class NonGenDemo {
    public static void main(String args[]){
        NonGen iOb;
        iOb = new NonGen(88);
        iOb.ShowType();
        int v= (Integer) iOb.getOb();
        System.out.println("Значення: "+v+"\n");
        NonGen strOb = new NonGen("Без узагальнень ");
        strOb.ShowType();
        String str = (String) strOb.getOb();
        System.out.println("Значення: "+str);
        iOb=strOb;
        v=(Integer) iOb.getOb();
                
    }
}
