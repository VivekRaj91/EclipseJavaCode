/*
    print :
    
   num=  5
     *
    ***
   *****
  *******
 *********

*/
package com.vivek.coreJava;

import java.util.Scanner;

public class StarPrintEx12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=num;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<i*2;k++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		sc.close();
	}

}
