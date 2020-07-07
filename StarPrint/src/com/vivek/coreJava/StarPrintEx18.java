/*
n=5
		 I 
		 I 
		 I 
		 I 
		 I 

L      OOO V       V EEEEEE
L      O O  V     V  E     
L      O O   V   V   EEEEEE
L      O O    V V    E     
LLLLL  OOO     V     EEEEEE


     U U
     U U
     U U
     U U
     UUU

*/package com.vivek.coreJava;

import java.util.Scanner;

public class StarPrintEx18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int m=1;m<=i;m++) {
				if(m==1)
				System.out.print("\t\t I ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1 && i<num) {
					System.out.print("L");
				}else if(i==num){
					System.out.print("L");
				}else {
					System.out.print(" ");
				}
			}
			for(int m=num;m>=i-1;m--) {
				System.out.print(" ");
			}
			for(int k=1;k<=num-2;k++) {
				if(k==1 ||i==1|| i==num || k==num-2 ) {
					System.out.print("O");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k= num*2-1;k>=i*2-1;k--) {
				if(k==num*2-1 || k==i*2-1)
				System.out.print("V");
				else 
					System.out.print(" ");
			}			
			for(int l=1;l<=i;l++) {
				System.out.print(" ");
			}
			for(int j=1;j<2;j++) {
				System.out.print("E");
				}
				for(int k=1;k<=num;k++) {
					if(i==1 || i==num/2+1 || i==num)
					System.out.print("E");
					else 
						System.out.print(" ");
				}
			System.out.println();
		}
		System.out.println();
		
		System.out.println();
		for(int i=1;i<=num;i++) {
			for(int k=num;k>=1;k--) {
				System.out.print(" ");
			}
			for(int k=1;k<=num-2;k++) {
				if(k==1 || i==num || k==num-2 ) {
					System.out.print("U");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
sc.close();
	}

}
