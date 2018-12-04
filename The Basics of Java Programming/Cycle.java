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
public class Cycle {
    public static void main (String args[])
        throws java.io.IOException {
        char choise;
        do {
            System.out.println("Довідка");
            System.out.println("1 - if");
            System.out.println("2 - switch");
            System.out.println("3 - while");
            System.out.println("4 - do-while");
            System.out.println("5- for\n");
            System.out.println("Виберіть потрібний пункт");
            choise = (char ) System.in.read();
        }while (choise<'1' || choise> '5');
        System.out.println();
        switch (choise){
            case '1': System.out.println("if:\n");
                      System.out.println("if (умова) оператор;");
                      System.out.println("else оператор;");
            break;
            case '2': System.out.println("switch\n...\nbreak");
            break;
            case '3': System.out.println("while {\n...\n}");
            break;
             case '4': System.out.println("do{\n...\n}while");
            break;
             case '5': System.out.println("for{\n...\n}");
            break;
            
        }
            
        }
     
        }
    

