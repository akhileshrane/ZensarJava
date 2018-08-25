package com.Akhilesh.MobileConnection;

public class MobileConnection {

	private int mobileNumber;
	private String typeOfConnection;
	private String serviceProvider;
	
	
	/*public MobileConnection(int mobileNumber, String typeOfConnection,
			String serviceProvider) {
		super();
		this.mobileNumber = mobileNumber;
		this.typeOfConnection = typeOfConnection;
		this.serviceProvider = serviceProvider;
	}*/
	
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getTypeOfConnection() {
		return typeOfConnection;
	}
	public void setTypeOfConnection(String typeOfConnection) {
		this.typeOfConnection = typeOfConnection;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	
	
	
}
