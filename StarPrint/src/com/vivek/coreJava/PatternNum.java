/*   n=5
     01 
    02 03 
   04 05 06 
  07 08 09 10 
 11 12 13 14 15 


*/package com.vivek.coreJava;
import java.util.Scanner;
public class PatternNum {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int n=1;
    for(int i=1;i<=num;i++) {
    	for(int j=num;j>=i;j--) {
    		System.out.print(" ");
    	}
    	for(int k=1;k<=i;k++) {
    		if(n>9) {
    		System.out.print(n+" ");
    		n++;
    		}else {
    			System.out.print("0"+n+" ");
        		n++;
    		}
    	}
    	System.out.println();
    	sc.close();
    }
	}
}
