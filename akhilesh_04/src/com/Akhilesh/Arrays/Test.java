package com.Akhilesh.Arrays;

public class Test {
	static float bill;

	public static float calculateCustomerBill(IceCream[] icecream ) {
		for(int i=0;i<icecream.length;i++) {
			Test.bill+=icecream[i].price;
			
		}
		return Test.bill;		
	}
	
	public static String getFlavourOfMaxPriceIcecream(IceCream[] icecream) {
		float largest = icecream[0].price;
		for(int i=0;i<icecream.length;i++) {	    
		    if (largest < icecream[i].price){
		    largest = icecream[i].price;
		    }
		}
		for(int i=0;i<icecream.length;i++) {
		if(largest==icecream[i].price)
		    {
		    	System.out.println("The costliest flavour is: "+icecream[i].flavour);
		    }
		}
		String x=Float.toString(largest); 
		return x;	
	}
	
	public static void main(String[] args) {
		IceCream iceCream1=new IceCream(70,"Chocolate");
		IceCream iceCream2=new IceCream(90,"Vanilla");
	
		IceCream[] icecream={iceCream1,iceCream2};
		calculateCustomerBill(icecream);
		
		for(int i=0;i<icecream.length;i++) {
		if(icecream[i].flavour.equals("Chocolate"))
			Test.bill=(float) (Test.bill-10.75);
		else
			Test.bill=(float) (Test.bill-5.25);
		}
		System.out.println("Total bill:" +Test.bill);
		getFlavourOfMaxPriceIcecream(icecream);
	
		
	}
	
}
