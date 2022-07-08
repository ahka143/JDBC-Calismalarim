import java.sql.*;

public class QueryCalisma04 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "241143");

        PreparedStatement ps=con.prepareStatement("insert into ogrenciler values(?,?,?,?)");


        ps.setString(1,"333");
        ps.setString(2,"ahmet");
        ps.setString(3,"Veli");
        ps.setInt(4,98);
        ps.execute();
    }
}
