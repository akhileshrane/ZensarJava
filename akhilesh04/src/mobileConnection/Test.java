package mobileConnection;

import java.util.Scanner;


public class Test extends mobileConnection {
	static mobileConnection[] n= new mobileConnection[5];
	
	public static void disp(int i) {
		System.out.println(""+ n[i].getMobileNumber());
		System.out.println(""+ n[i].getserviceProvider());
		System.out.println(""+ n[i].gettypeOfConnection());
	}
	
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		for(int i=0;i<5;i++){
			disp(i);
		}
		
}
}

