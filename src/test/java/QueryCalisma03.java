import java.sql.*;

public class QueryCalisma03 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch59?serverTimezone=UTC","root","241143");
        Statement st = con.createStatement();


        // SORU1: Bölümler tablosunda yeni bir kayıt (80, 'ARGE', 'ISTANBUL')
      st.executeUpdate("insert into bolumler values(80, 'ARGE', 'ISTANBUL')");

    }
}
