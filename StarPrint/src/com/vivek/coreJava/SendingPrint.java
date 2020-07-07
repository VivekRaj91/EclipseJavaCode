/*sending
      se
     sen
    send
   sendi
  sendin
 sending
gnidne
gnidn
gnid
gni
gn
g


*/
package com.vivek.coreJava;
public class SendingPrint {

	public static void main(String[] args) {
		int n=7;
		String s="sending";
		char[] Carry=s.toCharArray();
		
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(Carry[k]);
			}
			System.out.println();
		 }
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) {
				System.out.print(Carry[j]);
			}
			System.out.println();
		}
		
	}

}
