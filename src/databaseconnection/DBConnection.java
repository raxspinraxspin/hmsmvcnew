package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "M@r!k!t1";
    //private static final String MYSQL_CONN = "jdbc:mysql://localhost/hms";
    private static final String MYSQL_CONN = "jdbc:mysql://localhost/hms?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    //private static final String SQLITE_CONNECTION = "jdbc:sqlite:hms.sqlite";


    public static Connection getConnection()throws SQLException {
        /**
        try{
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQLITE_CONNECTION);

        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return null;
        **/
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(MYSQL_CONN, USERNAME, PASSWORD);

        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return null;
  }
}
