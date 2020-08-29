
import java.util.*;
import java.sql.*;

public class DataBaseConnectionClass {

	Connection con; // holds connection in between java & database
	PreparedStatement ps; // executes SQL queries

	public DataBaseConnectionClass() throws SQLException, ClassNotFoundException {
		String path = "jdbc:oracle:thin:@localhost:1522:XE";
		String username = "user1";
		String password = "password";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(path, username, password);
		System.out.println(" Connection Establish Successfully !!!! " + con);
	}
	
	// insert,delete,update 
	// use executeUpdate();
	public boolean insert_entry(int ID,String LASTNAME,String FIRSTNAME,int AGE)throws SQLException
	{
		String query = "insert into persons2 values(?,?,?,?)";
		ps = con.prepareStatement(query);
		ps.setInt(1, ID);
		ps.setString(2, LASTNAME);
		ps.setString(3, FIRSTNAME);
		ps.setInt(4, AGE);
				
		int i = ps.executeUpdate();
		if(i >0) return true;
		else return false;
	}
	
	public List<person2> get_student_range(int a1,int a2) throws SQLException
	{
		String query="select * from persons2 where age BETWEEN ? AND ?";
		ps=con.prepareStatement(query);
		ps.setInt(1,a1);
		ps.setInt(2,a2);
		ResultSet rs=ps.executeQuery();
		List<person2> list=new ArrayList<>();
		
		while(rs.next())
		{
			int ID = rs.getInt("ID");
			String LN = rs.getString("LASTNAME");
			String FN = rs.getString("FIRSTNAME");
			int A = rs.getInt("AGE");
		
			list.add(new person2(ID,LN,FN,A));
		}	
		return list;
		
	}
	
	// only for select statement use .executeQuery(); METHOD	
	public List<person2> get_all_records()throws SQLException
	{
		String sql = "select * from persons2";
		ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		List<person2> list = new ArrayList<>();
		
		while(rs.next())
		{
			int ID = rs.getInt("ID");
			String LN = rs.getString("LASTNAME");
			String FN = rs.getString("FIRSTNAME");
			int A = rs.getInt("AGE");
			
			list.add(new person2(ID,LN,FN,A));
		}	
		return list;
	}
	
	public boolean update_entry_by_id(int old_id,int new_id,String ln,String fn,int age) throws SQLException
	{
		String query="UPDATE persons2 SET ID=?,LASTNAME=?,FIRSTNAME=?,AGE=? WHERE ID=?";
		ps=con.prepareStatement(query);
		ps.setInt(1, new_id);
		ps.setString(2,ln);
		ps.setString(3,fn);
		ps.setInt(4,age);
		ps.setInt(5, old_id);	
		
		int i=ps.executeUpdate();
		if(i>0)
			return true;
		return false;
	}
	
	public boolean delete_entry_by_ID(int old_id) throws SQLException
	{
		String query="DELETE from persons2 WHERE ID=?";
		ps=con.prepareStatement(query);
		ps.setInt(1, old_id);
		
		int i=ps.executeUpdate();
		if(i>0)
			return true;
		return false;
	}
	

}

