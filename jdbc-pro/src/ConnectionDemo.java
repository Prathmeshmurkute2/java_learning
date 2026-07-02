import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.Driver;



public class ConnectionDemo {

	public static void main(String[] args) {
		// String url = "jdbc:mysql://localhost:3306/ellite";
		
		try {
			// DriverManager.registerDriver(new Driver());
			// Connection conn = DriverManager.getConnection(url, "root", "Prathum34");
			Connection conn = JdbcFactory.getConnection();
			System.out.println("connection successful!");
			
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB name: " + meta.getDatabaseProductName());
			System.out.println("DB version: " + meta.getDatabaseProductVersion());
			System.out.println("Driver name: " + meta.getDriverName());
			System.out.println("Driver version: " + meta.getDriverVersion());
			
			}catch (SQLException e){
			System.out.println("Connection failed due to...");
			e.printStackTrace();
		}

	}

}
