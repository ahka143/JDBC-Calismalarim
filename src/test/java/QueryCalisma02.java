import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryCalisma02 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "241143");

        Statement st=con.createStatement();

        String sorgu="create table isciler(id int,birim varchar(10),maas int)";

       // st.execute(sorgu);

       // st.execute("insert into isciler values(12,'temizlik',1000)");

        //st.execute("drop table isciler");
       // st.execute("alter table isciler add column (soyisim varchar(20) , sehir varchar(10) )");
        st.execute("alter table isciler modify ulke char(30)");

    }
}
