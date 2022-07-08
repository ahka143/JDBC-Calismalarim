import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

        PreparedStatement ps=con.prepareStatement("insert into urunler values(?, ?, ?)");

        List<Urun> kayitlar=new ArrayList<>();
        kayitlar.add(new Urun(1,"Laptop",10000));
        kayitlar.add(new Urun(2,"Monitor",2500));
        kayitlar.add(new Urun(3,"TV",15000));
        kayitlar.add(new Urun(4,"Klima",17000));
        kayitlar.add(new Urun(5,"Klavye",400));

        for(Urun each:kayitlar){
            ps.setInt(1,each.getId());
            ps.setString(2,each.getIsim());
            ps.setDouble(3,each.getFiyat());
            ps.addBatch();

        }
        ps.executeBatch();

st.close();
ps.close();
con.close();



    }
}
