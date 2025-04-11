/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitas;

import java.util.ArrayList;
/**
 *
 * @author damos
 */
public class ManajemenMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
        System.out.println("Data berhasil ditambahkan!");
    }

    public void tampilkanSemua() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            System.out.println("DAFTAR MAHASISWA:");
            for (Mahasiswa m : daftarMahasiswa) {
                m.tampilkanData();
            }
        }
    }

    public void tampilkanIPKTertinggi() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }

        Mahasiswa tertinggi = daftarMahasiswa.get(0);
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getIpk() > tertinggi.getIpk()) {
                tertinggi = m;
            }
        }

        System.out.println("MAHASISWA DENGAN IPK TERTINGGI:");
        tertinggi.tampilkanData();
    }
}
