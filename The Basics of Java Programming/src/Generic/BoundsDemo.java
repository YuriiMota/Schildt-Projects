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
class Stats<T extends Number>{
T[] nums;
Stats(T[] o){
    nums = o;
}
double avarange(){
    double sum= 0.0;
    for(int i=0;i<nums.length;i++) sum+=nums[i].doubleValue();
    return sum/nums.length;
}
boolean sameAvg(Stats<?> ob){
    if (avarange() == ob.avarange()) return true;
    return false;
}
}
public class BoundsDemo {
   public static void main(String args[]){
       Integer inums[]={1,2,3,4,5};
       Stats<Integer> iOb = new Stats<Integer>(inums);
       double v = iOb.avarange();
       System.out.println(v);
       
       Double dnums[]={1.1,2.2,3.3,4.4,5.5};
       Stats<Double> dod = new Stats<Double>(dnums);
       double d = dod.avarange();
       System.out.println(d);
       
       Float fnums[]={1F,2F,3F,4F,5F};
       Stats<Float> fOb= new Stats<Float>(fnums);
       double x = fOb.avarange();
       System.out.println(x);
       
       if (iOb.sameAvg(dod))
           System.out.println("рівні");
       else 
           System.out.println("Відрізняються");
       if (iOb.sameAvg(fOb))
           System.out.println("рівні");
       else 
           System.out.println("Відрізняються");
   } 
}
