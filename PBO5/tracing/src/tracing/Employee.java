/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tracing;

/**
 *
 * @author damos
 */
// Perbaikan: Employee seharusnya berada di luar kelas Person, bukan inner class
public class Employee extends Person {
    private double salary;

    // Konstruktor Employee harus memanggil konstruktor Person dengan super()
    public Employee(String n, int a, double s) {
        super(n, a); // Memanggil konstruktor dari kelas induk (Person)
        this.salary = s; // Inisialisasi salary
    }

    // Metode untuk menampilkan gaji
    public void showSalary() {
        System.out.println("Salary: " + salary); // Perbaikan: tanda koma diubah menjadi titik koma
    }
    
}