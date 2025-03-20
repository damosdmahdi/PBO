/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest;

/**
 *
 * @author damos
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("B 1234 AB", "Toyota", 250000, true);
        Mobil mobil2 = new Mobil("D 5678 CD", "Honda", 300000, true);
        
        Pelanggan pelanggan1 = new Pelanggan("Andi", "1234", "081234");
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
        
        Sewa sewa1 = new Sewa(pelanggan1, mobil1, 7);
        sewa1.prosesPenyewaan();
        
        mobil1.tampilkanInfo();
    }
}