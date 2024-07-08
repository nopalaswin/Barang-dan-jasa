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
//public class barang {
//    private String databaseName = "2210010151";
//    private String username = "root";
//    private String password = "";
//    public Connection koneksiDB;
//    
//    public barang(){
//        try {
//            String location = "jdbc:mysql://localhost/"+ databaseName;
//            Class.forName("com.mysql.jdbc.Driver");
//            koneksiDB = DriverManager.getConnection(location, username, password);
//            System.out.println("database terkoneksi");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void simpanBarang(String kode_barang, String nama_barang, String satuan, String harga_beli, String harga_jual){
//        try {
//            String sql = "insert into barang (kode_barang, nama_barang, satuan, harga_beli, harga_jual) value (?, ?, ?, ?, ?)";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, kode_barang);
//            perintah.setString(2, nama_barang);
//            perintah.setString(3, satuan);
//            perintah.setString(4, harga_beli);
//            perintah.setString(5, harga_jual);
//            
//            perintah.executeUpdate();
//            System.out.println("data berhasil disimpan");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void ubahBarang(String kode_barang, String nama_barang, String satuan, String harga_beli, String harga_jual){
//        try {
//            String sql = "update barang set nama_barang = ?, satuan = ?, harga_beli = ?, harga_jual = ? where kode_barang = ?";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, nama_barang);
//            perintah.setString(2, satuan);
//            perintah.setString(3, harga_beli);
//            perintah.setString(4, harga_jual);
//            perintah.setString(5, kode_barang);
//            
//            perintah.executeUpdate();
//            System.out.println("data berhasil diubah");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void hapusBarang(String kode_barang){
//        try {
//            String sql = "delete from barang where kode_barang = ?";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, kode_barang);
//            
//            perintah.executeUpdate();
//            System.out.println("data berhasil dihapus");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void cariBarang(String kode_barang){
//        try {
//            String sql = "select * from barang where kode_barang = ?";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, kode_barang);
//            ResultSet data = perintah.executeQuery();
//            while(data.next()){
//                System.out.println("KODE BARANG : "+data.getString("kode_barang"));
//                System.out.println("NAMA BARANG : "+data.getString("nama_barang"));
//                System.out.println("SATUAN : "+data.getString("satuan"));
//                System.out.println("HARGA BELI : "+data.getString("harga_beli"));
//                System.out.println("HARGA JUAL : "+data.getString("harga_jual"));
//            }
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//    }
//    
//    public void dataBarang(String kode_barang){
//        try {
//            Statement stmt = koneksiDB.createStatement();
//            ResultSet baris = stmt.executeQuery("select * from barang order by kode_barang");
//            while(baris.next()){
//                System.out.println(baris.getString("kode_barang")+" | "+
//                        baris.getString("nama_barang")+" | "+
//                        baris.getString("satuan")+" | "+
//                        baris.getString("harga_beli")+" | "+
//                        baris.getString("harga_jual"));
//            }
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//    }
//}
