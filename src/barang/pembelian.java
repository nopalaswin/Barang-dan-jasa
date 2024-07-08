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
//public class pembelian {
//    private String databaseName = "2210010151";
//    private String username = "root";
//    private String password = "";
//    public Connection koneksiDB;
//    
//    public pembelian(){
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
//    public void simpanBeli(String kode_beli, String kode_suplier, String nofaktur, String tglfaktur, String harga_beli, String harga_jual){
//        try {
//            String sql = "insert into pembelian (kode_beli, kode_suplier, nofaktur, tglfaktur, harga_beli, harga_jual) value (?, ?, ?, ?, ?, ?)";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, kode_beli);
//            perintah.setString(2, kode_suplier);
//            perintah.setString(3, nofaktur);
//            perintah.setString(4, tglfaktur);
//            perintah.setString(5, harga_beli);
//            perintah.setString(6, harga_jual);
//            
//            perintah.executeUpdate();
//            System.out.println("data berhasil disimpan");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void ubahBeli(String kode_beli, String kode_suplier, String nofaktur, String tglfaktur, String harga_beli, String harga_jual){
//        try {
//            String sql = "update pembelian set kode_suplier = ?, nofaktur = ?, tglfaktur = ?, harga_beli = ?, harga_jual = ? where kode_beli";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, kode_suplier);
//            perintah.setString(2, nofaktur);
//            perintah.setString(3, tglfaktur);
//            perintah.setString(4, harga_beli);
//            perintah.setString(5, harga_jual);
//            perintah.setString(6, kode_beli);
//            
//            perintah.executeUpdate();
//            System.out.println("data berhasil diubah");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void hapusBeli(String kode_beli){
//        try {
//            String sql = "delete from pembelian where kode_beli = ?";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, kode_beli);
//            perintah.executeUpdate();
//            System.out.println("data berhasil dihapus");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void cariBeli(String kode_beli){
//        try {
//            String sql = "select * from pembelian where kode_beli = ?";
//            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
//            perintah.setString(1, kode_beli);
//            ResultSet data = perintah.executeQuery();
//            while(data.next()){
//                System.out.println("KODE BELI : "+data.getString("kode_beli"));
//                System.out.println("KODE SUPLIER : "+data.getString("kode_suplier"));
//                System.out.println("NO FAKTUR : "+data.getString("nofaktur"));
//                System.out.println("TANGGAL FAKTUR : "+data.getString("tglfaktur"));
//                System.out.println("HARGA JUAL : "+data.getString("harga_jual"));
//                System.out.println("HARGA BELI : "+data.getString("harga_beli"));        
//            }
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//    }
//    
//    public void dataBeli(String kode_beli){
//        try {
//            Statement stmt = koneksiDB.createStatement();
//            ResultSet baris = stmt.executeQuery("select * from pembelian order by kode_beli asc");
//            while(baris.next()){
//                System.out.println(baris.getString("kode_beli")+" | "+
//                        baris.getString("kode_suplier")+" | "+
//                        baris.getString("nofaktur")+" | "+
//                        baris.getString("tglfaktur")+" | "+
//                        baris.getString("harga_jual")+" | "+
//                        baris.getString("harga_beli"));                
//            }
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//    }
//}
