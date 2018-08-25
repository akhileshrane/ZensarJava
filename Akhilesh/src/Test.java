import java.util.Scanner;


public class Test extends mobileConnection {
	static mobileConnection[] n= new mobileConnection[5];
	
	public void disp(int i) {
		System.out.println(""+ n[i].getMobileNumber());
		System.out.println(""+ n[i].getserviceProvider());
		System.out.println(""+ n[i].gettypeOfConnection());
	}
	
	
	public static void main() {
		
		for(int i=0;i<5;i++){
			n[i]=new mobileConnection();
		}
		Scanner in = new Scanner(System.in);
		for(int i=0;i<5;i++){
			int num = in.nextInt();
			String b= in.next();
			String c= in.next();
			 
			n[i].setMobileNumber(num);
			n[i].setserviceProvider(b);
			n[i].settypeOfConnection(c);
		}
}
}

