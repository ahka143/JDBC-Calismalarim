import java.sql.*;

public class Query02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");


        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "241143");



        Statement st = con.createStatement();

        ResultSet veri= st.executeQuery("select * from ogrenciler where cinsiyet='E'");
        // SORU01: ÖĞRENCİLER TABLOSUNDAKİ ERKEK ÖĞRENCİ BİLGİLERİ GETİRİN

        while (veri.next()){
            System.out.println(veri.getInt("okul_no")+" "+ veri.getString("ogrenci_ismi")
            +" "+ veri.getString("sinif")+" "+ veri.getString("cinsiyet"));
        }

        System.out.println("=========================================================");
        //SORU02: ÖĞRENCİLER TABLOSUNDAKİ  9. SINIF KIZ ÖĞRENCİ BİLGİLERİ GETİRİN

        ResultSet veri1=st.executeQuery("select * from ogrenciler where sinif='9' and cinsiyet='K' ");

        while (veri1.next()){
            System.out.println(veri1.getInt("okul_no")+" "+ veri1.getString("ogrenci_ismi")
                    +" "+ veri1.getString("sinif")+" "+ veri1.getString("cinsiyet"));
        }


    }
}
