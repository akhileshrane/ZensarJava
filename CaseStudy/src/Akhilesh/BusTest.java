package Akhilesh;

import java.sql.SQLException;
import java.util.List;

public class BusTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		BusDao busDao = new BusDao();
		List<Bus> busList = busDao.getBus();	
		for(Bus bus: busList){
			System.out.println(""+bus);			
			}
	}
	
}
