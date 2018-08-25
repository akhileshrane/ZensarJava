package akhilesh;
import java.sql.*;
import java.util.*;

public class StudentDao {
	Student student;
	
	String driverName = "com.mysql.jdbc.Driver";
	String url= "jdbc:mysql://localhost/akhilesh";
	String userName="root";
	String password="root";
	public List<Student> getAllStudents() throws SQLException, ClassNotFoundException {
		List<Student> allStudentsList = new ArrayList<Student>();

		//Loading the driver
		
		Class.forName(driverName);
		Connection con= DriverManager.getConnection(url,userName,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student;");
		while(rs.next()) {
			int rollNumber = rs.getInt("rollno");
			String studentName=rs.getString("name");
			int age=rs.getInt("age");
			String course = rs.getString("course");
			
			Student student = new Student();
			student.setRollNumber(rollNumber);
			student.setName(studentName);
			student.setAge(age);
			student.setCourse(course);
			allStudentsList.add(student);
		}
		con.close();
		st.close();
		rs.close();
		
		return allStudentsList;

	}
	/*
	 * Add data to db
	 */
	public int addStudent(Student student) throws ClassNotFoundException, SQLException{
		int numberOfStudentsAdded = 0;
		Class.forName(driverName);
		Connection con= DriverManager.getConnection(url,userName,password);
		PreparedStatement st;
		st=con.prepareStatement("insert into student values(?,?,?,?);");
		st.setString(2, student.getName());
		st.setInt(3, student.getAge());
		st.setString(4, student.getCourse());
		st.setInt(1, student.getRollNumber());
		numberOfStudentsAdded=st.executeUpdate();
		System.out.println("Records added: "+numberOfStudentsAdded);
		return numberOfStudentsAdded;	
	}
	/*
	 * Update data from db
	
	
	public int updateStudent(Student student)throws ClassNotFoundException, SQLException {
		int numberOfStuentsUpdated = 0;
		Class.forName(driverName);
		Connection con= DriverManager.getConnection(url,userName,password);
		Statement st=con.createStatement();
		numberOfStuentsUpdated=st.executeUpdate("UPDATE student SET course="+student.getCourse()+",age="+student.getAge()+",name="+student.getName()+"where rollno="+student.getRollNumber()+";");
		con.close();
		st.close();
		System.out.println("Records updated : "+numberOfStuentsUpdated);
		return numberOfStuentsUpdated;
		
	}
	*/
	public int updateStudent(Student student)throws ClassNotFoundException, SQLException {
		int numberOfStuentsUpdated = 0;
		Class.forName(driverName);
		Connection con= DriverManager.getConnection(url,userName,password);
		PreparedStatement st;
		st=con.prepareStatement("update student set name=?,age=?,course=? where rollno=?;");
		st.setString(1, student.getName());
		st.setInt(2, student.getAge());
		st.setString(3, student.getCourse());
		st.setInt(4, student.getRollNumber());
		numberOfStuentsUpdated=st.executeUpdate();
		System.out.println("Records updated : "+numberOfStuentsUpdated);
		return numberOfStuentsUpdated;
		
	}
	
	public int deleteStudent(int rollNumber) throws ClassNotFoundException, SQLException{
		int numberOfStudentsDeleted = 0;
		Class.forName(driverName);
		Connection con= DriverManager.getConnection(url,userName,password);
		Statement st=con.createStatement();
		numberOfStudentsDeleted=st.executeUpdate("delete from student where rollno="+rollNumber+";");
		con.close();
		st.close();
		System.out.println("Records deleted : "+numberOfStudentsDeleted);
		return numberOfStudentsDeleted;
		
	}
}

