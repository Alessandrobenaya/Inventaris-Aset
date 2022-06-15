package koneksi_login;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conek_login {
    private static Connection koneksi_login;
    public static Connection GetConnection()throws SQLException {
        if (koneksi_login==null){
            new Driver();
            koneksi_login =DriverManager.getConnection("jdbc:mysql://localhost:3306/loginuser","root","");
        }
        return koneksi_login;
    }
}
