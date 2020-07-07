/*
n=5 character = L
    L
    L 
    L
    L
    LLLLL

*/package com.vivek.coreJava;
import java.util.Scanner;
public class StarPrintEx17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1 && i<num) {
					System.out.print("L");
				}else if(i==num){
					System.out.print("L");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
