/*
    Enter Number :  4
      
      4 3 2 *
      4 3 * 1
      4 * 2 1
      * 3 2 1 
  
 
 */

package com.vivek.coreJava;

import java.util.Scanner;

public class StarEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number  :");
		int n=sc.nextInt();
		sc.close();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				if(i+j==n+1) {
				System.out.print("*");
			}else
			{
				System.out.print(j);
			}
		  }
			System.out.println();
		}
	}

}
