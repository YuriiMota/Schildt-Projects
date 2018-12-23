/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import static java.lang.Math.abs;
import static java.lang.Math.sin;
import java.util.Scanner;

/**
 *
 * @author Yura
 */
public class Graan {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		double eps = scan.nextDouble();
		
		double y = 1; 
		double y1 = 0;
		
		double x = 1;
		
		do{
			y1 +=  sin(x)/x;
			//System.out.println(y1);
			x=x/2;
		}while (abs(y-y1)>eps);
		
		System.out.println(y1);
	}
}
