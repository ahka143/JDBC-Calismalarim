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

        // Soru3: Tüm bölümlerde çalışan personel isimlerini, bölüm isimlerini ve maaşlarını,
// bölüm ve maas sıralı listeleyiniz.
// NOT: Çalışanı olamasa bile bölüm ismi gösterilmelidir.

        System.out.println("=====================================");
        ResultSet veri2=st.executeQuery("SELECT \n" +
                "   B.bolum_isim, P.personel_isim,  P.maas\n" +
                "FROM\n" +
                "    bolumler AS B\n" +
                "        LEFT JOIN\n" +
                "    personel AS P ON B.bolum_id = P.bolum_id\n" +
                "ORDER BY B.bolum_isim DESC , P.maas;");

        while (veri2.next()){
            System.out.printf("%-10s %-10s %6d\n",veri2.getString(1),veri2.getString(2),veri2.getInt(3));
        }

        // SORU4: Maaşı en yüksek 10 kişinin bolümünü, adını ve maaşını listeleyiniz.
        System.out.println("============================");

        ResultSet veri4= st.executeQuery("select p.personel_isim, b.bolum_isim, p.maas from bolumler b left join personel p on b.bolum_id=p.bolum_id order by maas desc limit 10");

        while (veri4.next()){
            System.out.printf("%-10s %-10s %6d\n",veri4.getString(1),veri4.getString(2),veri4.getInt(3));
        }

        st.close();
        con.close();
    }
}
