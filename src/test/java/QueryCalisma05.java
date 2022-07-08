import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryCalisma05 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch59?serverTimezone=UTC", "root", "241143");
        Statement st = con.createStatement();

        // SORU1: Urunler adında bir tablo olusturalım (id int, isim varchar(10), fiyat int)

       // st.execute("create table urunler(id int, isim varchar(10), fiyat int);");

        // SORU2: urunler tablosuna aşağıdaki verileri toplu bir şekilde etkileyin
        // Çok miktarda kayıt eklemek için PreparedStatement metodu kullanılır.
        // 1) Veri girişine uygun bir POJO (Plain Old Java Object) class oluşturulur
        // 2) POJO class ta nesneleri saklayacak bir collection oluşturulur
        // 3) Bir döngü ile kayıtlar eklenir.





    }
}
