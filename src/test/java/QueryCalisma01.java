import java.sql.*;

public class QueryCalisma01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC","root","241143");

        Statement st=con.createStatement();

        ResultSet veri=st.executeQuery("SELECT * FROM ogrenciler, notlar WHERE ogrenciler.okul_no = notlar.okul_no;");

        while (veri.next()){
            System.out.printf("%d5  %s-10  %d-5  %s-4\n",veri.getInt(1),veri.getString(2),veri.getInt(3),veri.getString(4));
        }
    }
}
