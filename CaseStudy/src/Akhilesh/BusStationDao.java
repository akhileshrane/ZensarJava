package Akhilesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class BusStationDao {
	String driverName = "com.mysql.jdbc.Driver";
	String url= "jdbc:mysql://localhost/BusStation";
	String userName="root";
	String password="root";
	
	public List<BusStation> getBusStations() throws SQLException, ClassNotFoundException {
		List<BusStation> busStationList = new ArrayList<BusStation>();
		//Loading the driver		
		Class.forName(driverName);
		Connection con= DriverManager.getConnection(url,userName,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from BusStation;");
		while(rs.next()) {
			String busStationName = rs.getString("busStation");
			int platformCount =rs.getInt("platformCount");
							
			BusStation busStation=new BusStation();
			busStation.setBusStation(busStationName);
			busStation.setPlatformCount(platformCount);
			
			busStationList.add(busStation);
			
		}
		con.close();
		st.close();
		rs.close();
		
		return busStationList;

}
}
