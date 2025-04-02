/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysystem;

/**
 *
 * @author damos
 */
public class User {
    private String nama;
    private String idUser;

    public User(String nama, String idUser) {
        this.nama = nama;
        this.idUser = idUser;
    }

    public void pinjamBuku(Buku buku) {
        buku.pinjamBuku();
    }

    public void kembalikanBuku(Buku buku) {
        buku.kembalikanBuku();
    }
}
