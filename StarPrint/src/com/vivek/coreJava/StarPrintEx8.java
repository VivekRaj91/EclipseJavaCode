/* print :
    
     *
    * *
   *   *
  * * * *
 *       *


*/package com.vivek.coreJava;

import java.util.Scanner;

public class StarPrintEx8 {
   public static void main(String []args) {
	   Scanner sc=new Scanner(System.in);
	   int num=5;
	   System.out.println("enter character  :");
	   char ch=sc.next().charAt(0);
	   for(int i=1;i<=num;i++) {
		   for(int j=num;j>i;j--) {
			   System.out.print(" ");
		   }
		   for(int k=1;k<=i;k++) {
			   if(i==3 && k==2) {
				   System.out.print("  ");
			   }else if(i==3 && k==2) {
				   System.out.print("  ");
			   }else if(i==num && k==2) {
				   System.out.print("  ");
			   }else if(i==num && k==3) {
				   System.out.print("  ");
			   }else if(i==num && k==4) {
				   System.out.print("  ");
			   }else
			   System.out.print(" "+ch);
		   }
		   
		   System.out.println();
	   }
	   sc.close();
   }
}
