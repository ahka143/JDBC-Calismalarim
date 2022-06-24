import java.sql.*;

public class Query01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1) Driver Yükle
        Class.forName("com.mysql.jdbc.Driver");

        //2) Bağlanti Oluştur
        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "241143");
        // okul: bağlanti yapacağimiz database'in ismi

        //3) Statement: SQL kodlarimizi yazmak için bir nesne oluştur
        Statement st = con.createStatement();

        //4) ResultSet:
        ResultSet veri = st.executeQuery("select * from ogrenciler");
    }
}
