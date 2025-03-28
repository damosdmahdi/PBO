/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tracing;

/**
 *
 * @author damos
 */
public class MainApp {
    public static void main(String[] args) {
        // Perbaikan: Angka desimal harus menggunakan titik, bukan format ribuan
        Employee emp = new Employee("Alice", 25, 5000.0);
        emp.display(); // Menampilkan nama dan umur
        emp.showSalary(); // Menampilkan gaji
    }
}