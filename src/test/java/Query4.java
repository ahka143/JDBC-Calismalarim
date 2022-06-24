import java.sql.*;

public class Query4 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");


        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "241143");

        PreparedStatement pr = con.prepareStatement("select * from ogrenciler");

        ResultSet rs = pr.executeQuery();

        ResultSetMetaData rsmd = rs.getMetaData();

        System.out.println("1. sutunun ismi: " + rsmd.getColumnName(1));
        System.out.println("2. sutunun ismi: " + rsmd.getColumnName(2));
        System.out.println("3. sutunun ismi: " + rsmd.getColumnName(3));
        System.out.println("4. sutunun ismi: " + rsmd.getColumnName(4));
        System.out.println("======================================");

        System.out.println("Toplam sutun sayisi: " + rsmd.getColumnCount());
        System.out.println("======================================");

        System.out.println("1.sutunun data tipi: " + rsmd.getColumnTypeName(1));
        System.out.println("2.sutunun data tipi: " + rsmd.getColumnTypeName(2));
        System.out.println("3.sutunun data tipi: " + rsmd.getColumnTypeName(3));
        System.out.println("4.sutunun data tipi: " + rsmd.getColumnTypeName(4));

        System.out.println("======================================");

        System.out.println("Tablonun ismi: " + rsmd.getTableName(1));

        System.out.println("satir sayisi: "+ rsmd.getColumnTypeName(1).length());

    }
}
