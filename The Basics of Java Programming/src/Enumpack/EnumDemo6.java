/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumpack;
import java.util.Random;
/**
 *
 * @author Yura
 */
enum Answer{
    YES, NO,MAYBE,LATER,SOON,NEVER;
}
class Question{
    Random rand = new Random();
    Answer ask(){
        int prob= (int) (100*rand.nextDouble());
        if (prob<15) 
            return Answer.MAYBE;
         if (prob<30) 
            return Answer.NO;
          if (prob<50) 
            return Answer.YES;
           if (prob<75) 
            return Answer.SOON;
            if (prob<98) 
            return Answer.LATER;
            else 
                return Answer.NEVER;
    }
}
public class EnumDemo6 {
    static void answer (Answer result ){
        
    }
}
