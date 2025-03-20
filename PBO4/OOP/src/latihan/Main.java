/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author damos
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", "12345678", "Informatika", 3.2);
        mhs1.tampilkanInfo();
        System.out.println("Lulus: " + (mhs1.cekLulus() ? "Ya" : "Tidak"));
    }
}
