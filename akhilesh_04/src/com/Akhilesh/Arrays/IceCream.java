package com.Akhilesh.Arrays;

public class IceCream {

	float price;
	static float discount;
	String flavour;
	
	IceCream(float price, String flavour) {
		this.price = price;
		this.flavour = flavour;
	}
	
	public static float update(IceCream[] iceCreamArr) {
		float dis1 = 0,dis2 = 0;
		for(int i=0;i<iceCreamArr.length;i++)
		{
			if(iceCreamArr[i].flavour.equals("Chocolate")){
				dis1=((float)10.75);
			}
			else{
				dis2=((float)5.25);			
			}
			}
		IceCream.discount= dis1+dis2;
		return IceCream.discount;
		
	}
	

	public static void main(String[] args) {
		
		IceCream iceCream1= new IceCream(70,"Chocolate");
		IceCream iceCream2=new IceCream(90,"Vanilla");
		IceCream[] iceCreamArr = {iceCream1,iceCream2};
		
		IceCream.update(iceCreamArr);
		
		System.out.println("Total discount: " +IceCream.discount);
		
	}

}
