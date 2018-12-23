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
import Inheritance.Protection;
 class OtherPackage {
     
     OtherPackage(){
         Protection a = new Protection();
          System.out.println("Констуктор  з іншого пакету");
         //System.out.println("n= "+a.n);
       //System.out.println("n_pri= "+a.n_pri);
        //System.out.println("n_pro= "+a.n_pro);
        System.out.println("n_pub= "+a.n_pub);
         
     }
    
}
