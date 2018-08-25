	package Akhilesh;
	import java.util.*;

public class Platform extends BusStation {
	private int number;
	private String busName;
	private int isAllocated;
	
	
	
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getBusName() {
		return busName;
	}


	public void setBusName(String busName) {
		this.busName = busName;
	}


	public int getIsAllocated() {
		return isAllocated;
	}


	public void setIsAllocated(int isAllocated) {
		this.isAllocated = isAllocated;
	}

	
	Platform() {
		super();
		// TODO Auto-generated constructor stub
	}

	Platform(int number, String busName, int isAllocated) {
		super();
		this.number = number;
		this.busName = busName;
		this.isAllocated = isAllocated;
	
	}
	
	@Override
	public String toString() {
		return "Platform [number=" + number + ", busName=" + busName + ", isAllocated=" + isAllocated
				+ "]";
	}

	public static void main(String[] args) {

}
}
