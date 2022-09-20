package jdbcexample;
import java.sql.*;
public class JdbcApp1 {
    static Connection con;
    public static void main(String[] args) {
        try {
            Connection con =  Conn.getConn();
            String vsql = "Update emp set ename='Shivansh Dubey',esal=9000000 where eid=101";
            Statement st = con.createStatement();
            int n1 = st.executeUpdate(vsql);
            System.out.println("Updated the record: " + n1);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
