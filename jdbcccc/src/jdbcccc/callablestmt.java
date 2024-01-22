package jdbcccc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.Callable;

public class callablestmt {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbcc", "root", "");
			CallableStatement cs = con.prepareCall("{ call insertData (?,?,?,?)}");
			cs.setInt(1, 1);
			cs.setString(2, "jhon");
			cs.setString(3, "cena");
			cs.setInt(4, 22);
			cs.executeQuery();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
