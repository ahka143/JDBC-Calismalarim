import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueryCalisma03 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch59?serverTimezone=UTC", "root", "241143");
        Statement st = con.createStatement();


        // SORU1: Bölümler tablosunda yeni bir kayıt (80, 'ARGE', 'ISTANBUL')
       // int satir = st.executeUpdate("insert into bolumler values(80, 'ARGE', 'ISTANBUL')");
       // System.out.println(satir);

        /*
        //1.yol:
        List<String> cokluVeri = new ArrayList<>(Arrays.asList("insert into bolumler values(91, 'YEMEKHANE', 'GAZIANTEP')",
                "insert into bolumler values(92, 'OFIS3', 'ELAZIG')",
                "insert into bolumler values(93, 'OFIS4', 'MALATYA')"));
        int counter = 0;
        for (String each : cokluVeri
        ) {
            counter = counter + st.executeUpdate(each);
        }
        System.out.println(counter+" satir eklendi");
*/
        //2.yol:

        List<String> cokluVeri1 = new ArrayList<>(Arrays.asList("insert into bolumler values(94, 'terzi', 'mus')",
                "insert into bolumler values(95, 'buro4', 'nevsehir')",
                "insert into bolumler values(96, 'buro5', 'nigde')"));

        for (String each:cokluVeri1
             ) {
            st.addBatch(each);
        }
        st.executeBatch();
    }
}
