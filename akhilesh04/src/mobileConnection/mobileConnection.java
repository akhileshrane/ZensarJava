package mobileConnection;
import java.util.*;


public class mobileConnection {
	static Scanner in = new Scanner(System.in);
	private int mobileNumber;
	private String serviceProvider;
	private String typeOfConnection;

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getserviceProvider()
	{    
	    return serviceProvider;
	}

	public void setserviceProvider(String serviceProvider)
	{
	     this.serviceProvider = serviceProvider;
	}

	public String gettypeOfConnection()
	{
		return typeOfConnection;
	}

	public void settypeOfConnection(String typeOfConnection)
	{
		this.typeOfConnection = typeOfConnection;
	}
	
	public static void main(String args[]) {
		
		
		mobileConnection[] n=new mobileConnection[5];
		for(int i=0;i<5;i++){
			int num = in.nextInt();
			String b= in.next();
			String c=in.next();
			n[i]=new mobileConnection();
			n[i].setMobileNumber(num);
		    n[i].setserviceProvider(b);
	     	n[i].settypeOfConnection(c);
		}
	}
	}


