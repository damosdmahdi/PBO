/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author damos
 */
public class Mahasiswa {
    String nama;
    int nim;
    String jurusan;
    Boolean isLulus = false;
    
    public Mahasiswa(String nama, int nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }
    void belajar(){
        System.out.println(nama + " sedang belajar");
    }
    String getNama(){
        return nama;
    }
    class Dalam{
        void test(){
            
            
        }
    }
}
