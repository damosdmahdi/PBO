/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matakuliah;

import dosen.dosen;
import Mahasiswa.mahasiswa;
import java.util.ArrayList;

/**
 *
 * @author damos
 */
public class matakuliah {
    private String nama;
    private String kodeMK;
    private ArrayList<dosen> pengampu;
    private ArrayList<mahasiswa> dataMahasiswa;
    
    public matakuliah(String nama, String koloMK){
        this.nama = nama;
        this.kodeMK = kodeMK;
    }
    
    public void setDaftarMahasiswa(ArrayList<mahasiswa> daftarMahasiswa){
        this.dataMahasiswa = dataMahasiswa;
    }
    
    public void setPengampu(ArrayList<dosen> pengampu){
        this.pengampu = pengampu;
    }
    
    public String getnama(){
        return nama;
    }
    public String getKodeMK(){
        return kodeMK;
    }
    public ArrayList<dosen> getpengampu(){
        return pengampu;
    }
}


