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
 class Parent {
    private void method1() {
        System.out.println("Parent's method1()");
    }

    public void method2() {
        System.out.println("Parent's method2()");
        method1();
    }
}

 class Child extends Parent {
    public void method1() {
        System.out.println("Child's method1()");		
    }

    public static void main(String args[]) {
       float a = 9/0;
    }
}
