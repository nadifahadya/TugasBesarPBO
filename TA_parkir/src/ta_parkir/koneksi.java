package ta_parkir;
import java.sql.*;

public class koneksi {
    public Connection conn;
    public Statement st;
    public ResultSet rs;
    
    public void koneksi()
    {   
        konek("localhost","db_parkir","root","");
    }
    
    public void konek(String server, String db, String user,String passwd){
        System.out.println("Keterangan");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Tidak Berhasil Terhubung");
            return;
        }
        System.out.println("Berhasil Terhubung");
        conn = null;
        try {
            conn = DriverManager.getConnection(
            "jdbc:mysql://"+server+":3306/"+db,user,passwd);
        } catch (SQLException e) {
            System.out.println("Tidak Bisa Koneksi Ke Database");
            return;
        }
        if (conn != null)
            System.out.println("Berhasil Koneksi!");
        else
            System.out.println("Koneksi Gagal........ !");
        }
    }
