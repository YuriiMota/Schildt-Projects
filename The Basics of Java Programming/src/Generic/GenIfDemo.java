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
interface MinMax<T extends Comparable <T>>{
    T min();
    T max();
}
class MyClass<T extends Comparable<T>> implements MinMax{
    T[] vals;
    MyClass(T[] o){
        vals=o;
    }
    //повернути мінімальне значення з масиву волс
    public T min(){
        T v = vals[0];
        for(int i=1;i<vals.length;i++)
            if (vals[i].compareTo(v)<0) v=vals[i];
        return v;
        
    }
    public T max(){
        T v = vals[0];
        for(int i=1;i<vals.length;i++)
            if (vals[i].compareTo(v)>0) v=vals[i];
        return v;
    }
}
public class GenIfDemo {
   public static void main(String args[]){
       Integer inums[]={1,2,3,4,5};
       Character chs[]={'b','r','p','w'};
       MyClass<Integer>iob = new MyClass<Integer>(inums);
       MyClass<Character>cob = new MyClass<Character>(chs);
       System.out.println("Max = "+iob.max());
       System.out.println("Min = "+iob.min());
       System.out.println("Max = "+cob.max());
       System.out.println("Min = "+cob.min());
   }
}
