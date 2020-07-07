package com.vivek.CoreJava1;

import java.util.Scanner;

public class PermCombi {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
	System.out.println("-------  please choose either p or c    ----------------");
	System.out.println("permutation/combination    [p/c]   :");
	Character ch=sc.next().charAt(0);
	System.out.println("enter  n :");
	int n=sc.nextInt();
	System.out.println("Enter r :");
	int r=sc.nextInt();
	int number=n;
	long nfact=1;
	for(int i=1;i<=n;i++) {
		nfact=nfact*i;
	}
	//System.out.println(nfact);
	int t=n-r;
	long n_rfact=1;
	for(int i=1;i<=t;i++) {
		n_rfact=n_rfact*i;
	}
	switch(ch) {
	case 'p':  {
		long nPr=nfact/n_rfact;
		System.out.println("nPr  ="+nPr);
	}
	case 'c':{
	int rfact=1;
	for(int i=1;i<=r;i++) {
		rfact=rfact*i;
	}
	System.out.println("-------------------------------------------");
	int ncrfact=1;
	for(int j=number;j>=t+1;j--) {
		ncrfact=ncrfact*j;
	}
	System.out.println("ncr  out loop ="+ncrfact/rfact);
	     }
    }
	System.out.print("Do you want more [Y/N]  :");
	Character y_n=sc.next().charAt(0);
	if(y_n=='y') {
		continue;
	}
	else {
		System.out.println("\n"+"-------------------------------------------");
		System.out.println("****thanks for using this application*****");
		break;
	}
	  }
	sc.close();
	}
}
