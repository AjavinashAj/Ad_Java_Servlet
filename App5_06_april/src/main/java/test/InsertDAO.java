package test;
import java.sql.*;
public class InsertDAO {
	public int k=0;
	public int insert(ProductBean pb)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into product48 values(?,?,?,?)");
			ps.setString(1, pb.getCode());
			ps.setString(2, pb.getName());
			ps.setInt(3, pb.getQty());
			ps.setDouble(4, pb.getPrice());
			int k=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}

}
