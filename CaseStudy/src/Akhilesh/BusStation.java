package Akhilesh;

public class BusStation {
	
	private String busStation;
	private int platformCount;
	
	
	BusStation(String busStation, int platformCount) {
		super();
		this.busStation = busStation;
		this.platformCount = platformCount;
	}


	BusStation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getBusStation() {
		return busStation;
	}


	public void setBusStation(String busStation) {
		this.busStation = busStation;
	}


	public int getPlatformCount() {
		return platformCount;
	}

	public void setPlatformCount(int platformCount) {
		this.platformCount = platformCount;
	}

	
	@Override
	public String toString() {
		return "BusStation [busStation=" + busStation + ", platformCount=" + platformCount + "]";
	}


	public static void main(String[] args) {
	}

}
