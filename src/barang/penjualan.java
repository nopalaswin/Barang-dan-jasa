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
//public class penjualan {
//    private String databaseName = "2210010151";
//    private String username = "root";
//    private String password = "";
//    public Connection koneksiDB;
//    
//    public penjualan(){
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
//    public void simpanJual (String kode_penjualan, String nofaktur, String tglfaktur, String harga_beli, String harga_jual){
//        try {
//            String sql = "insert into penjualan(kode_penjualan, nofaktur, tglfaktur, harga_beli, harga_jual) value (?, ?, ?, ?, ?)";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, kode_penjualan);
//            perintah.setString(2, nofaktur);
//            perintah.setString(3, tglfaktur);
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
//    public void ubahJual (String kode_penjualan, String nofaktur, String tglfaktur, String harga_beli, String harga_jual){
//        try {
//            String sql = "update penjualan set nofaktur = ?, tglfaktur = ?, harga_beli = ?, harga_jual = ? where kode_penjualan = ?";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, nofaktur);
//            perintah.setString(2, tglfaktur);
//            perintah.setString(3, harga_beli);
//            perintah.setString(4, harga_jual);
//            perintah.setString(5, kode_penjualan);
//            
//            perintah.executeUpdate();
//            System.out.println("data berhasil diubah");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void hapusJual(String kode_penjualan){
//        try {
//            String sql = "delete from penjualan where kode_penjualan = ?";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, kode_penjualan);
//            perintah.executeUpdate();
//            System.out.println("data berhasil dihapus");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void cariJual(String kode_penjualan){
//        try {
//            String sql = "select * from where kode_penjualan = ?";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, kode_penjualan);
//            ResultSet data = perintah.executeQuery();
//            while(data.next()){
//                System.out.println("KODE PENJUALAN : "+data.getString("kode_penjualan"));
//                System.out.println("NO FAKTUR : "+data.getString("nofaktur"));
//                System.out.println("TANGGAL FAKTUR : "+data.getString("tglfaktur"));
//                System.out.println("HARGA BELI : "+data.getString("harga_beli"));
//                System.out.println("HARGA JUAL : "+data.getString("harga_jual"));
//            }
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//    }
//    
//    public void dataJual(String kode_penjualan){
//        try {
//            Statement stmt = koneksiDB.createStatement();
//            ResultSet baris = stmt.executeQuery("select * from penjualan order by kode_penjualan asc");
//            while(baris.next()){
//                System.out.println(baris.getString("kode_penjualan")+" | "+
//                        baris.getString("nofaktur")+" | "+
//                        baris.getString("tglfaktur")+" | "+
//                        baris.getString("harga_beli")+" | "+
//                        baris.getString("harga_jual"));
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
