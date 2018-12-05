/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumpack;
import java.lang.annotation.*;
import java.lang.reflect.*;

//оголошення типу аннотації
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
String str();
int val();
}

public class Meta {
 //аннотований метод
    @MyAnno (str="Example annotation",val=100)
    public static void myMeth(){
      Meta ob = new Meta();
      //отримати аннотацію із метода і вивести значення її членів
     
          //чпочатку отримати обєкт типу Class , що представляє даний клас
          Class<?> c = ob.getClass();
      
    }
}
