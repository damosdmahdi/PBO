/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest;

/**
 *
 * @author damos
 */
class Mobil {
    private String nomorPlat;
    private String merek;
    private double hargaSewaPerHari;
    private boolean tersedia;

    // Konstruktor default
    public Mobil() {
        this("Tidak diketahui", "Tidak diketahui", 0.0, true);
    }

    // Konstruktor berparameter
    public Mobil(String nomorPlat, String merek, double hargaSewaPerHari, boolean tersedia) {
        this.nomorPlat = nomorPlat;
        this.merek = merek;
        this.hargaSewaPerHari = hargaSewaPerHari;
        this.tersedia = tersedia;
    }

    // Getter
    public String getNomorPlat() { return nomorPlat; }
    public String getMerek() { return merek; }
    public double getHargaSewaPerHari() { return hargaSewaPerHari; }
    public boolean isTersedia() { return tersedia; }

    // Setter
    public void setTersedia(boolean tersedia) { this.tersedia = tersedia; }

    // Metode menampilkan informasi mobil
    public void tampilkanInfo() {
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Merek: " + merek);
        System.out.println("Harga Sewa per Hari: " + hargaSewaPerHari);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Tidak Tersedia"));
    }
}

// Kelas Pelanggan
class Pelanggan {
    private String nama;
    private String nomorKTP;
    private String nomorHP;

    public Pelanggan(String nama, String nomorKTP, String nomorHP) {
        this.nama = nama;
        this.nomorKTP = nomorKTP;
        this.nomorHP = nomorHP;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Nomor KTP: " + nomorKTP);
        System.out.println("Nomor HP: " + nomorHP);
    }
}

// Kelas Utility untuk diskon dan format harga
class Utility {
    public static double hitungDiskon(double totalBiaya, int lamaSewa) {
        return (lamaSewa > 5) ? totalBiaya * 0.1 : 0;
    }

    public static String formatMataUang(double jumlah) {
        return "Rp " + String.format("%,.2f", jumlah);
    }
}

// Kelas Sewa
class Sewa {
    private Pelanggan pelanggan;
    private Mobil mobil;
    private int lamaSewa;
    private double totalBiaya;

    public Sewa(Pelanggan pelanggan, Mobil mobil, int lamaSewa) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.lamaSewa = lamaSewa;
    }

    public void prosesPenyewaan() {
        if (mobil.isTersedia()) {
            totalBiaya = mobil.getHargaSewaPerHari() * lamaSewa;
            double diskon = Utility.hitungDiskon(totalBiaya, lamaSewa);
            totalBiaya -= diskon;
            mobil.setTersedia(false);
            cetakStruk();
        } else {
            System.out.println("Maaf, mobil tidak tersedia.");
        }
    }

    public void cetakStruk() {
        pelanggan.tampilkanInfo();
        mobil.tampilkanInfo();
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Total Biaya: " + Utility.formatMataUang(totalBiaya));
        System.out.println("Status Transaksi: Berhasil");
    }
}
