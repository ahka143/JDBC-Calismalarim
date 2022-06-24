import java.sql.*;

public class Query03 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");


        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch59?serverTimezone=UTC", "root", "241143");


        Statement st = con.createStatement();

        // SORU1: Bölümler tablosundan tüm kayıtları listeleyiniz.

        ResultSet veri = st.executeQuery("select * from bolumler");

        while (veri.next()) {
            System.out.println(veri.getInt(1) + " " + veri.getString(2) + " " + veri.getString(3));
        }
        System.out.println("=====================================================");
        // SORU2:SATIS ve MUHASEBE bolumlerinde calişan personelin isimlerini ve maaşlarını,
// maaş ters sıralı listeleyiniz.

        ResultSet veri1 = st.executeQuery("select personel_isim,maas from personel where bolum_id in(10,30) order by maas desc ; ");

        while ( veri1.next()){
            System.out.println(veri1.getString(1)+" "+ veri1.getInt(2));
        }
    }
}
