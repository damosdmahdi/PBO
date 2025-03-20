/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author damos
 */
class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }
    
    
    public void tampilkanInfo() {
        System.out.println(nama);
        System.out.println(nim);
        System.out.println(jurusan);
        System.out.println(ipk);
    }

    public boolean cekLulus() {
        return ipk >= 3.0;
    }
    
}

