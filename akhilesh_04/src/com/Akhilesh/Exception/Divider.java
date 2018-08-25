package com.Akhilesh.Exception;
import java.util.*;

public class Divider {

	public static int divide( int num,int den) throws Numerator0Exception {
		if(num==0) {
			throw new Numerator0Exception();
		}
		int result=num/den;
		return result;		
	}
public static void main(String[] args) {
	try{
	Scanner sc= new Scanner(System.in);
	int num= sc.nextInt();
	int den=sc.nextInt();
	int result =divide(num,den);
	System.out.println(""+result);
	}catch(Numerator0Exception e){
		System.out.println("Error: " +e);
	}
	catch(ArithmeticException e){
		System.out.println("Please Enter a non zero denominator");
	}
}
}
