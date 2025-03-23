/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smtoko;

/**
 *
 * @author damos
 */
class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String email;
    private double saldo;

    public Pelanggan(String idPelanggan, String nama, String email, double saldo) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.email = email;
        this.saldo = saldo;
    }

    public void tampilkanInfoPelanggan() {
        System.out.println("IDPelanggan: " + idPelanggan);
        System.out.println("nama: " + nama);
        System.out.println("email: " + email);
        System.out.println("saldo: Rp " + String.format("%,.2f", saldo));
    }

    public boolean kurangiSaldo(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        } else {
            System.out.println("Saldo tidak mencukupi!");
            return false;
        }
    }

    public void topUpSaldo(double jumlah) {
        saldo += jumlah;
    }
}
