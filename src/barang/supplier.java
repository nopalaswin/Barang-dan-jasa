package barang;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package penjualanObat;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
///**
// *
// * @author ASUS
// */
//public class supplier {
//    private String databaseName = "2210010151";
//    private String username = "root";
//    private String password = "";
//    public Connection koneksiDB;
//    
//    public supplier(){
//        try {
//            String location = "jdbc:mysql://localhost/"+databaseName;
//            Class.forName("com.mysql.jdbc.Driver");
//            koneksiDB = DriverManager.getConnection(location, username, password);
//            System.out.println("database terkoneksi");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void simpanSuplier( String kode_suplier, String nama_suplier, String alamat_suplier, String telp_suplier, String email_suplier){
//        try {
//            String sql = "insert into suplier ( kode_suplier, nama_suplier, alamat_suplier, telp_suplier, email_suplier) value (?, ?, ?, ?, ?)";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, kode_suplier);
//            perintah.setString(2, nama_suplier);
//            perintah.setString(3, alamat_suplier);
//            perintah.setString(4, telp_suplier);
//            perintah.setString(5, email_suplier);
//            
//            perintah.executeUpdate();
//            System.out.println("data berhasil disimpan");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void ubahSuplier(String kode_suplier, String nama_suplier, String alamat_suplier, String telp_suplier, String email_suplier){
//        try {
//            String sql = "update suplier set nama_suplier = ?, alamat_suplier = ?, telp_suplier = ?, email_suplier = ? where kode_suplier = ?";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, nama_suplier);
//            perintah.setString(2, alamat_suplier);
//            perintah.setString(3, telp_suplier);
//            perintah.setString(4, email_suplier);
//            perintah.setString(5, kode_suplier);
//            
//            perintah.executeUpdate();
//            System.out.println("data berhasil diubah");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void hapusSuplier(String kode_suplier){
//        try {
//            String sql = "delete from suplier where kode_suplier = ?";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, kode_suplier);
//            perintah.executeUpdate();
//            System.out.println("data berhasil dihapus");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void cariSuplier(String kode_suplier){
//        try {
//            String sql = "select * from suplier where kode_suplier = ?";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, kode_suplier);
//            ResultSet data = perintah.executeQuery();
//            while(data.next()){
//                System.out.println("KODE SUPLIER : "+data.getString("kode_suplier"));
//                System.out.println("KODE SUPLIER : "+data.getString("nama_suplier"));
//                System.out.println("KODE SUPLIER : "+data.getString("alamat_suplier"));
//                System.out.println("KODE SUPLIER : "+data.getString("telp_suplier"));
//                System.out.println("KODE SUPLIER : "+data.getString("email_suplier"));               
//            }
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//    }
//    
//    public void dataSuplier(String kode_suplier){
//        try {
//            Statement stmt = koneksiDB.createStatement();
//            ResultSet baris = stmt.executeQuery("select * from suplier order by kode_suplier asc");
//            while(baris.next()){
//                System.out.println(baris.getString("kode_suplier")+" | "+
//                        baris.getString("nama_suplier")+" | "+
//                        baris.getString("alamat_suplier")+" | "+
//                        baris.getString("telp_suplier")+" | "+
//                        baris.getString("email_suplier"));
//            }
//        } catch (Exception e) {
//           System.err.println(e.getMessage());
//        }
//    }
//}
