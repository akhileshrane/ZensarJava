package Akhilesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlatformDao {
	String driverName = "com.mysql.jdbc.Driver";
	String url= "jdbc:mysql://localhost/Platform";
	String userName="root";
	String password="root";
	
	public List<Platform> getPlatform() throws SQLException, ClassNotFoundException {
		List<Platform> platformList = new ArrayList<Platform>();
		//Loading the driver		
		Class.forName(driverName);
		Connection con= DriverManager.getConnection(url,userName,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from platform;");
		while(rs.next()) {
			
			String busName =rs.getString("busName");
			int number = rs.getInt("number");
			int isAllocated= rs.getInt("isAllocated");
							
			Platform platform=new Platform();
			platform.setBusName(busName);
			platform.setIsAllocated(isAllocated);
			platform.setNumber(number);
			
			platformList.add(platform);
			
		}
		con.close();
		st.close();
		rs.close();
		
		return platformList;
}
}
