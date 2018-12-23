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
public class proste_chuslo {
    public static void main (String args[]){
        /*int n= 2;

        if (n<0) b=false;
        else*/
        boolean b;
        for(int n=2;n<100;n++) {
            b = true;
            for (int i = 2; i < n; i++) {
                if ((n % i) == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.print(n+ " ");
        }}
}
