/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smtoko;

/**
 *
 * @author damos
 */
public class SmToko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produk produk1 = new Produk("P001", "Laptop ASUS", 8500000, 5);
        Produk produk2 = new Produk("P002", "Mouse Logitech", 250000, 10);
        
        Pelanggan pelanggan1 = new Pelanggan("C001", "Budi", "budi@email.com", 10000000);
        
        System.out.println("\nInformasi Produk");
        produk1.tampilkanInfoProduk();
        produk2.tampilkanInfoProduk();
        
        System.out.println("\n Informasi Pelanggan");
        pelanggan1.tampilkanInfoPelanggan();
        
        System.out.println("\nProses Transaksi");
        Transaksi transaksi1 = new Transaksi("T001", pelanggan1, produk1, 1);
        transaksi1.prosesTransaksi();
        
        System.out.println("\nStatus Produk Setelah Transaksi");
        produk1.tampilkanInfoProduk();
        pelanggan1.tampilkanInfoPelanggan();
    }
    
}
