package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class database {

    private String databaseName = "2210010151";
    private String username = "root";
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/" + databaseName;
    public static Connection koneksiDB;

    public database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            System.out.println("Database Terkoneksi");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Koneksi Gagal: " + e.getMessage());
        }
    }

    //TABLE UJI//
    public void simpanuji(String nik, String nama, String no_telp, String alamat) {
        try {
            String SQL = "INSERT INTO UJI (nik, nama, no_telp, alamat) VALUES (?, ?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setString(1, nik);
            perintah.setString(2, nama);
            perintah.setString(3, no_telp);
            perintah.setString(4, alamat);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (SQLException e) {
            System.err.println("Gagal Menyimpan Data: " + e.getMessage());
        }
    }
    
        public void ubahuji(String nik, String nama, String no_telp, String alamat) {
        try {
            String SQL = "UPDATE UJI SET nama = ?, no_telp = ?, alamat = ? WHERE nik = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setString(1, nama);
            perintah.setString(2, no_telp);
            perintah.setString(3, alamat);
            perintah.setString(4, nik);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (SQLException e) {
            System.err.println("Gagal Menyimpan Data: " + e.getMessage());
        }
        
    }
        public void hapusuji(String nik){
            try {
                String SQL = "DELETE FROM UJI WHERE nik=?";
                PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                perintah.setString(1, nik);
                perintah.executeUpdate();
                System.out.println("Data berhasil dihapus");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        
        public void cariuji(String nik){
            try {
                String SQL="SELECT*FROM uji WHERE nik=?";
                PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                perintah.setString(1, nik);
                ResultSet data = perintah.executeQuery();
                while(data.next()){
                    System.out.println("NIK :"+data.getString("nik"));
                    System.out.println("NAMA :"+data.getString("nama"));
                    System.out.println("NO_TELPON :"+data.getString("no_telp"));
                    System.out.println("ALAMAT :"+data.getString("alamat"));
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        
        public void datauji(){
            try {
                Statement stmt = koneksiDB.createStatement();
                ResultSet baris = stmt.executeQuery("SELECT*FROM uji ORDER BY nik ASC");
                while (baris.next()){
                    System.out.println(baris.getString("nik")+" | "+
                            baris.getString("nama")+" | "+
                            baris.getString("no_telp")+" | "+
                            baris.getString("alamat"));
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        
    //TABLE PEGAWAI
public void simpanBarang(String kode_barang, String nama_barang, String satuan, int harga_beli, int harga_jual) {
    try {
        String sql = "insert into barang (kode_barang, nama_barang, satuan, harga_beli, harga_jual) values (?, ?, ?, ?, ?)";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setString(1, kode_barang);
        perintah.setString(2, nama_barang);
        perintah.setString(3, satuan);
        perintah.setInt(4, harga_beli);
        perintah.setInt(5, harga_jual);
        
        perintah.executeUpdate();
        System.out.println("Data berhasil disimpan");
    } catch (SQLException e) {
        System.err.println("Gagal Menyimpan Data: " + e.getMessage());
    }
}

public void ubahBarang(String kode_barang, String nama_barang, String satuan, int harga_beli, int harga_jual) {
    try {
        String sql = "update barang set nama_barang = ?, satuan = ?, harga_beli = ?, harga_jual = ? where kode_barang = ?";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setString(1, nama_barang);
        perintah.setString(2, satuan);
        perintah.setInt(3, harga_beli);
        perintah.setInt(4, harga_jual);
        perintah.setString(5, kode_barang);
        
        perintah.executeUpdate();
        System.out.println("Data berhasil diubah");
    } catch (SQLException e) {
        System.err.println("Gagal Menyimpan Data: " + e.getMessage());
    }
}

public void hapusBarang(String kode_barang) {
    try {
        String sql = "delete from barang where kode_barang = ?";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setString(1, kode_barang);
        
        perintah.executeUpdate();
        System.out.println("Data berhasil dihapus");
    } catch (SQLException e) {
        System.err.println("Gagal Menghapus Data: " + e.getMessage());
    }
}

//
public void simpanBeli(String kode_beli, String kode_suplier, String nofaktur, String tglfaktur, int harga_beli, int harga_jual) {
    try {
        String sql = "insert into pembelian (kode_beli, kode_suplier, nofaktur, tglfaktur, harga_beli, harga_jual) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setString(1, kode_beli);
        perintah.setString(2, kode_suplier);
        perintah.setString(3, nofaktur);
        perintah.setString(4, tglfaktur);
        perintah.setInt(5, harga_beli);
        perintah.setInt(6, harga_jual);
        
        perintah.executeUpdate();
        System.out.println("Data berhasil disimpan");
    } catch (SQLException e) {
        System.err.println("Gagal Menyimpan Data: " + e.getMessage());
    }
}

public void ubahBeli(String kode_beli, String kode_suplier, String nofaktur, String tglfaktur, int harga_beli, int harga_jual) {
    try {
        String sql = "update pembelian set kode_suplier = ?, nofaktur = ?, tglfaktur = ?, harga_beli = ?, harga_jual = ? where kode_beli = ?";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setString(1, kode_suplier);
        perintah.setString(2, nofaktur);
        perintah.setString(3, tglfaktur);
        perintah.setInt(4, harga_beli);
        perintah.setInt(5, harga_jual);
        perintah.setString(6, kode_beli);
        
        perintah.executeUpdate();
        System.out.println("Data berhasil diubah");
    } catch (SQLException e) {
        System.err.println("Gagal Mengubah Data: " + e.getMessage());
    }
}

public void hapusBeli(String kode_beli) {
    try {
        String sql = "delete from pembelian where kode_beli = ?";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setString(1, kode_beli);
        
        perintah.executeUpdate();
        System.out.println("Data berhasil dihapus");
    } catch (SQLException e) {
        System.err.println("Gagal Menghapus Data: " + e.getMessage());
    }
}

//
public void simpanJual(String kode_penjualan, String nofaktur, String tglfaktur, int harga_beli, int harga_jual) {
    try {
        String sql = "insert into penjualan(kode_penjualan, nofaktur, tglfaktur, harga_beli, harga_jual) values (?, ?, ?, ?, ?)";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setString(1, kode_penjualan);
        perintah.setString(2, nofaktur);
        perintah.setString(3, tglfaktur);
        perintah.setInt(4, harga_beli);
        perintah.setInt(5, harga_jual);
        
        perintah.executeUpdate();
        System.out.println("Data berhasil disimpan");
    } catch (SQLException e) {
        System.err.println("Gagal Menyimpan Data: " + e.getMessage());
    }
}

public void ubahJual(String kode_penjualan, String nofaktur, String tglfaktur, int harga_beli, int harga_jual) {
    try {
        String sql = "update penjualan set nofaktur = ?, tglfaktur = ?, harga_beli = ?, harga_jual = ? where kode_penjualan = ?";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setString(1, nofaktur);
        perintah.setString(2, tglfaktur);
        perintah.setInt(3, harga_beli);
        perintah.setInt(4, harga_jual);
        perintah.setString(5, kode_penjualan);
        
        perintah.executeUpdate();
        System.out.println("Data berhasil diubah");
    } catch (SQLException e) {
        System.err.println("Gagal Mengubah Data: " + e.getMessage());
    }
}

public void hapusJual(String kode_penjualan) {
    try {
        String sql = "delete from penjualan where kode_penjualan = ?";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setString(1, kode_penjualan);
        
        perintah.executeUpdate();
        System.out.println("Data berhasil dihapus");
    } catch (SQLException e) {
        System.err.println("Gagal Menghapus Data: " + e.getMessage());
    }
}

//
public void simpanSuplier(String kode_suplier, String nama_suplier, String alamat_suplier, String telp_suplier, String email_suplier) {
    try {
        String sql = "insert into suplier(kode_suplier, nama_suplier, alamat_suplier, telp_suplier, email_suplier) values (?, ?, ?, ?, ?)";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setString(1, kode_suplier);
        perintah.setString(2, nama_suplier);
        perintah.setString(3, alamat_suplier);
        perintah.setString(4, telp_suplier);
        perintah.setString(5, email_suplier);
        
        perintah.executeUpdate();
        System.out.println("Data berhasil disimpan");
    } catch (SQLException e) {
        System.err.println("Gagal Menyimpan Data: " + e.getMessage());
    }
}

public void ubahSuplier(String kode_suplier, String nama_suplier, String alamat_suplier, String telp_suplier, String email_suplier) {
    try {
        String sql = "update suplier set nama_suplier = ?, alamat_suplier = ?, telp_suplier = ?, email_suplier = ? where kode_suplier = ?";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setString(1, nama_suplier);
        perintah.setString(2, alamat_suplier);
        perintah.setString(3, telp_suplier);
        perintah.setString(4, email_suplier);
        perintah.setString(5, kode_suplier);
        
        perintah.executeUpdate();
        System.out.println("Data berhasil diubah");
    } catch (SQLException e) {
        System.err.println("Gagal Mengubah Data: " + e.getMessage());
    }
}

public void hapusSuplier(String kode_suplier) {
    try {
        String sql = "delete from suplier where kode_suplier = ?";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setString(1, kode_suplier);
        
        perintah.executeUpdate();
        System.out.println("Data berhasil dihapus");
    } catch (SQLException e) {
        System.err.println("Gagal Menghapus Data: " + e.getMessage());
    }
}

    public void ubahBeli(String kode_beli, String kode_suplier, String nofaktur, String tglfaktur, String harga_beli, String harga_jual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void simpanBeli(String kode_beli, String kode_suplier, String nofaktur, String tglfaktur, String harga_beli, String harga_jual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
