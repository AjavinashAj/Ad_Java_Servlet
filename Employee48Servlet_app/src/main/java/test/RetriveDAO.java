package test;
import java.sql.*;
import java.util.*;
public class RetriveDAO {
	
	public ArrayList<EmployeeBean> al=new ArrayList<EmployeeBean>();
	
	public ArrayList<EmployeeBean>retrieve()
	{
		try {
			
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement
					("select * from Employee48");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				EmployeeBean eb=new EmployeeBean();//Bean object
				
				eb.setId(rs.getString(1));
				eb.setName(rs.getString(2));
				eb.setDesgn(rs.getString(3));
				eb.setBsal(rs.getInt(4));
				eb.setTotSal(rs.getInt(5));
				al.add(eb);//Adding bean to Arraylist
			}//end of loop
		}catch (Exception e) {e.printStackTrace();}
		
		return al;
	}

}
