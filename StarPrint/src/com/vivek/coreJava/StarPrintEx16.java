/*

n=5
      
 *       *
  *     *
   *   *
    * *
     *

*/
package com.vivek.coreJava;
import java.util.Scanner;
public class StarPrintEx16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k= num*2-1;k>=i*2-1;k--) {
				if(k==num*2-1 || k==i*2-1)
				System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
