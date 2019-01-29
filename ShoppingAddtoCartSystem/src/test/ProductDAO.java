package test;
import java.sql.*;
import java.util.*;
public class ProductDAO {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Collection getProduct(){
		try {
			Connection con=DriverConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Product");
			ArrayList al=new ArrayList();
			while(rs.next()) {
				Product p=new Product();
				p.Code=rs.getString(1);
				p.Name=rs.getString(1);
				p.Qty=rs.getDouble(1);
				al.add(p);	
				}
			return al;
		}catch(Exception e) {
		System.out.println(e.getStackTrace());
		}
	return null;	
	};
}
