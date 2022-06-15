package koneksi_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class laporandata_konek {
     private static Connection koneksi_login;
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/laporan_tubes3";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(laporandata_konek.class.getName()).log(Level.SEVERE, null, ex);
            }
            koneksi_login = DriverManager.getConnection(url, user, pass);
            
                       
       }catch(SQLException e){
           
           System.out.println("KONEKSI KE DATABASE GAGAL " + e.getMessage());
       }
        return koneksi_login;
    }
}
