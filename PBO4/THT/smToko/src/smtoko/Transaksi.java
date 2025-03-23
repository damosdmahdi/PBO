/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smtoko;

/**
 *
 * @author damos
 */
class Transaksi {
    private String idTransaksi;
    private Pelanggan pelanggan;
    private Produk produk;
    private int jumlahBeli;
    private double totalHarga;

    public Transaksi(String idTransaksi, Pelanggan pelanggan, Produk produk, int jumlahBeli) {
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
        this.totalHarga = produk.getHarga() * jumlahBeli;
    }

    public void prosesTransaksi() {
        if (pelanggan.kurangiSaldo(totalHarga) && produk.kurangiStok(jumlahBeli)) {
            System.out.println("Transaksi Berhasil!");
            tampilkanDetailTransaksi();
        } else {
            System.out.println("Transaksi Gagal!");
        }
    }

    public void tampilkanDetailTransaksi() {
        System.out.println("\nDetail Transaksi");
        System.out.println("ID Transaksi: " + idTransaksi);
        pelanggan.tampilkanInfoPelanggan();
        produk.tampilkanInfoProduk();
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total Harga: Rp " + String.format("%,.2f", totalHarga));
    }
}