package jdbcexample;

import java.sql.*;

public class Conn {
    static Connection con;
    public static Connection getConn() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cgi1","root","ROOT");

        }catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }

}
