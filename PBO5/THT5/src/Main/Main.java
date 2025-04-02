/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import librarysystem.Buku;
import librarysystem.Perpustakaan;
import librarysystem.User;
/**
 *
 * @author damos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perpustakaan perpustakaan = new Perpustakaan(5);

        Buku buku1 = new Buku("Java Programming", "ferdinand dan beno", 1995);
        Buku buku2 = new Buku("Python Basics", "Ade irawan", 2000);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.tampilkanBuku();

        User user1 = new User("Godri", "U123");
        user1.pinjamBuku(buku1);
        user1.kembalikanBuku(buku1);
    }
    
}
