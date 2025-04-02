package librarysystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author damos
 */
public class Perpustakaan {
    private Buku[] koleksiBuku;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        koleksiBuku = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < koleksiBuku.length) {
            koleksiBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku " + buku.getJudul() + " ditambahkan ke perpustakaan.");
        } else {
            System.out.println("Perpustakaan penuh, tidak dapat menambah buku.");
        }
    }

    public void tampilkanBuku() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("- " + koleksiBuku[i].getJudul() + " oleh " + koleksiBuku[i].getPenulis()
            + " (" + koleksiBuku[i].getTahunTerbit() + ")");
        }
    }
}