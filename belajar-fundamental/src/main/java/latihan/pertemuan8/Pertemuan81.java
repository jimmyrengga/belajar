package latihan.pertemuan8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pertemuan81 {
    
    private static void deletePeserta(Statement statement) throws SQLException {
        String sql = "delete from peserta where id = 1";
        statement.executeUpdate(sql);
    }
    
    public static void main(String[] args) {
        
        Connection conn = null;
        Statement statement = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/LATIHAN", 
                    "root", 
                    "admin");
            
            System.out.println("sukses konek ke mysql");
            
            System.out.println("Membuat table ...");
            statement = conn.createStatement();
//            statement.executeUpdate("CREATE DATABASE LATIHAN");
//            System.out.println("database latihan terbuat");
            
            createTable(statement);
            
            System.out.println("inserta data ke table peserta");
            insertToPeserta(statement);
            
            System.out.println("--data peserta--");
            readPeserta(statement);
            
            System.out.println("update data peserta id 1");
            updatePeserta(statement);
            
            System.out.println("--data peserta--");
            readPeserta(statement);
            
            System.out.println("delete data peserta id 1");
            deletePeserta(statement);
            System.out.println("--data peserta--");
            readPeserta(statement);
            
            System.out.println("drop table");
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    
    
    private static void updatePeserta(Statement statement) throws SQLException {
        Random rand = new Random();
        int nextRan = rand.nextInt(100);
        String sql = "update peserta set nama = 'aku" + nextRan +"' where id = 2";
        statement.executeUpdate(sql);
    }
    
    private static void readPeserta(Statement statement) throws SQLException {
        String sql = "select * from peserta";
        ResultSet rs = statement.executeQuery(sql);
        List<Peserta> list = new ArrayList<Peserta>();
        while (rs.next()) {
            Peserta p = new Peserta();
            p.setNama(rs.getString("nama"));
            p.setId(rs.getInt("id"));
            
            list.add(p);
            System.out.println("id = " + rs.getInt("id") 
                    + ", nama = " + rs.getString("nama"));
        }
    }
    
    private static void createTable(Statement statement) throws SQLException {
        String sql = "Create table IF NOT EXISTS peserta ("
                + "id INTEGER NOT NULL AUTO_INCREMENT, "
                + "nama VARCHAR(255), "
                + "PRIMARY KEY (id))";
        
        statement.executeUpdate(sql);
    }
    
    private static void insertToPeserta(Statement statement) throws SQLException {
        String sql = "Insert into peserta (nama) values ('jimmy')";
        statement.executeUpdate(sql);
    }
    
}
