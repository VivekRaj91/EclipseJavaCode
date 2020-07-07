package com.vivek.coreJava;

import java.util.Scanner;

public class StarPrintEx6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=num;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=num-1;k>i;k--) {
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				if(l<num)
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int l=1;l<i;l++) {
				System.out.print(" ");
			}
			for(int m=num;m>i;m--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
