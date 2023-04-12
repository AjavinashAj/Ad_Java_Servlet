package test;
import java.sql.*;
public class InsertDAO {
	public int k=0;
	public int insert(BookBean bb) {
		
		try {
			Connection con=DBConnection.getCon();//Access in the connection
			
			PreparedStatement ps=con.prepareStatement("insert into BookDetails48 values(?,?,?,?,?)");
			
			ps.setString(1, bb.getBcode());
			ps.setString(2, bb.getBname());
			ps.setString(3, bb.getBauthour());
			ps.setFloat(4, bb.getPrice());
			ps.setInt(5, bb.getBqty());
			
			k=ps.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		
		return k;
	}

}
