/* n=5
    15 
   14 13 
  12 11 10 
 09 08 07 06 
05 04 03 02 01 


*/package com.vivek.coreJava;
import java.util.Scanner;
public class PatternNumEx1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();  //  5
	int n=15;
	for(int i=1;i<=num;i++) {
		for(int j=num;j>i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			if(n<10) {
			System.out.print("0"+n+" ");
			n--;
			}else {
				System.out.print(n+" ");
				n--;
			}
		}
		System.out.println();
	}
	sc.close();
}
}
