import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query05 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");


        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "241143");


        Statement st = con.createStatement();

        // SORU: İşçiler adında bir tablo oluşturunuz. id int, birim VARCHAR(10), maas int
        String sorgu = "create table isciler (id int , birim varchar (10), maas int)";
       st.execute(sorgu);
        System.out.println("isciler tablosu olusturuldu");

        //isciler tablosunu sil

       // st.execute("drop table isciler");
       // System.out.println("isciler tablosu silindi");


        //SORU: isciler tablosuna soyisim varchar(20), sehir varchar(10) adında 2 tane sutun ekleyiniz.

    }
}
