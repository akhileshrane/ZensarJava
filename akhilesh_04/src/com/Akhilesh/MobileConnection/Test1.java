package com.Akhilesh.MobileConnection;

public class Test1 {

	public static void main(String[] args) {
		
		MobileConnection mobileConnection1 = new MobileConnection();
		mobileConnection1.setMobileNumber(7275);
		mobileConnection1.setServiceProvider("Tata");
		mobileConnection1.setTypeOfConnection("Prepaid");
		
		MobileConnection mobileConnection2 = new MobileConnection();
		mobileConnection2.setMobileNumber(7275);
		mobileConnection2.setServiceProvider("Tata");
		mobileConnection2.setTypeOfConnection("Prepaid");

		MobileConnection mobileConnection3 = new MobileConnection();
		mobileConnection3.setMobileNumber(7275);
		mobileConnection3.setServiceProvider("Tata");
		mobileConnection3.setTypeOfConnection("Prepaid");
		
		MobileConnection mobileConnection4 = new MobileConnection();
		mobileConnection4.setMobileNumber(7275);
		mobileConnection4.setServiceProvider("Tata");
		mobileConnection4.setTypeOfConnection("Prepaid");
		
		MobileConnection mobileConnection5 = new MobileConnection();
		mobileConnection5.setMobileNumber(7275);
		mobileConnection5.setServiceProvider("Tata");
		mobileConnection5.setTypeOfConnection("Prepaid");
		
		
		MobileConnection[] mobileConnectionArr= {mobileConnection1,mobileConnection2,mobileConnection3,mobileConnection4,mobileConnection5};

		for(int i=0;i<mobileConnectionArr.length;i++) {
			MobileConnection mobileConnection = mobileConnectionArr[i];
			System.out.println(""+ mobileConnection.getMobileNumber()+ " "+ mobileConnection.getServiceProvider()+" "+mobileConnection.getTypeOfConnection());
		}
		
		
		
		
	}

}
