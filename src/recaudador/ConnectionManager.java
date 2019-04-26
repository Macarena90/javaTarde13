package recaudador;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
    public Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost/actas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root","");
        
        return conn;
        // conn.close();
    }
}
