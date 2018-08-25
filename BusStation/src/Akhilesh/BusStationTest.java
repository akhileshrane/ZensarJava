package Akhilesh;

import java.sql.SQLException;
import java.util.List;

public class BusStationTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		BusStationDao busStationDao = new BusStationDao();
		List<BusStation> busList = busStationDao.getBusStations();	
		for(BusStation busStation: busList){
			System.out.println(""+busStation);			
			}
}
}
