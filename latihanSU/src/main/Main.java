/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import model.Book;
import model.Member;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author damos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    String inputSystem;
    Scanner input = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();
    
    public void tambahBuku() {
        System.out.println("\n== Tambah Buku ==");
        System.out.print("Judul: ");
        String title = input.nextLine();
        System.out.print("Penulis: ");
        String author = input.nextLine();
        System.out.print("Tahun Terbit: ");
        int year = input.nextInt();
        input.nextLine(); // bersihkan newline

        Book book = new Book(title, author, year);
        books.add(book);
        System.out.println("Buku berhasil ditambahkan!\n");
    }

    public void tambahAnggota() {
        System.out.println("\n== Tambah Anggota ==");
        System.out.print("Nama: ");
        String name = input.nextLine();
        System.out.print("ID Anggota: ");
        String memberId = input.nextLine();

        Member member = new Member(name, memberId);
        members.add(member);
        System.out.println("Anggota berhasil ditambahkan!\n");
    }

    public void tampilkanBuku() {
        System.out.println("\n== Daftar Buku ==");
        if (books.isEmpty()) {
            System.out.println("Belum ada buku.");
        } else {
            for (Book book : books) {
                System.out.println("- " + book.getTitle() + " oleh " + book.getAuthor() + " (" + book.getYearPublished() + ")");
            }
        }
        System.out.println();
    }

    public void tampilkanAnggota() {
        System.out.println("\n== Daftar Anggota ==");
        if (members.isEmpty()) {
            System.out.println("Belum ada anggota.");
        } else {
            for (Member member : members) {
                System.out.println("- " + member.getName() + " (ID: " + member.getMember() + ")");
            }
        }
        System.out.println();
    }

    public void menu() {
        while (true) {
            System.out.println("=== Sistem Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Tampilkan Buku");
            System.out.println("4. Tampilkan Anggota");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); // bersihkan newline

            switch (pilihan) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    tambahAnggota();
                    break;
                case 3:
                    tampilkanBuku();
                    break;
                case 4:
                    tampilkanAnggota();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.\n");
            }
        }
    }

    public static void main(String[] args) {
        Main system = new Main();
        system.menu();
    }
    
    
    
    
}
