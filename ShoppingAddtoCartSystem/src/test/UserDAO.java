package test;
import java.sql.*;
public class UserDAO {
	public boolean validate(String UName,String PWord) {
		try {
			Connection con=DriverConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from UserDetails where UName=\'"+UName+"\' AND PWord=\'"+PWord+"\'");
			return rs.next();
		}catch(Exception e) {
			System.out.print(e.getStackTrace());
		}
		return false;
	}

}
