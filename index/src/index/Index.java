/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package index;


import java.util.Scanner;
/**
 *
 * @author damos
 */


public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = input.nextInt();
        input.nextLine(); // membersihkan buffer
        
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("\nData Karyawan ke-" + (i + 1));
            System.out.print("ID Karyawan: ");
            String id = input.nextLine();
            
            System.out.print("Nama Karyawan: ");
            String nama = input.nextLine();
            
            System.out.println("Pilih Shift Kerja (1: Pagi, 2: Siang, 3: Malam): ");
            int shift = input.nextInt();
            
            System.out.print("Total jam kerja dalam seminggu: ");
            int jamKerja = input.nextInt();
            
            System.out.print("Jumlah hari absen: ");
            int absen = input.nextInt();
            input.nextLine(); // membersihkan buffer
            
            // Menentukan tarif per jam berdasarkan shift
            int tarifPerJam;
            switch (shift) {
                case 1:
                    tarifPerJam = 30000;
                    break;
                case 2:
                    tarifPerJam = 35000;
                    break;
                case 3:
                    tarifPerJam = 40000;
                    break;
                default:
                    System.out.println("Shift tidak valid, gunakan shift pagi (1).\n");
                    tarifPerJam = 30000;
            }
            
            // Perhitungan gaji dasar
            int gaji = jamKerja * tarifPerJam;
            
            // Perhitungan lembur (> 40 jam)
            if (jamKerja > 40) {
                int lemburJam = jamKerja - 40;
                int upahLembur = lemburJam * (tarifPerJam + 10000);
                gaji += upahLembur;
            }
            
            // Potongan gaji jika kerja < 30 jam
            if (jamKerja < 30) {
                gaji -= gaji * 0.1; // Potongan 10%
            }
            
            // Potongan absen (100.000 per hari absen)
            gaji -= absen * 100000;
            
            // Menampilkan hasil
            System.out.println("\nLaporan Gaji Karyawan");
            System.out.println("ID: " + id);
            System.out.println("Nama: " + nama);
            System.out.println("Shift: " + shift);
            System.out.println("Jam Kerja: " + jamKerja + " jam");
            System.out.println("Hari Absen: " + absen);
            System.out.println("Total Gaji: Rp" + gaji);
        }
        
        input.close();
    }
    
}
