/* n=5
             1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1


*/package com.vivek.coreJava;
import java.util.Scanner;
public class NumPrint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int n = sc.nextInt();
       for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%"+ (n - i) * 2+ "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
 		sc.close();
	}
}