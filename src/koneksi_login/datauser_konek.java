package koneksi_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class datauser_konek {

    private static Connection koneksi_login;
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/laporan_tubes";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi_login = DriverManager.getConnection(url, user, pass);
            
                       
       }catch(SQLException e){
           
           System.out.println("KONEKSI KE DATABASE GAGAL " + e.getMessage());
       }
        return koneksi_login;
    }
}