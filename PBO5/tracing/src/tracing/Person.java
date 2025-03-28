/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tracing;

/**
 *
 * @author damos
 */
public class Person {
    private String name;
    private int age;

    // Konstruktor untuk inisialisasi atribut name dan age
    public Person(String n, int a) {
        name = n;
        age = a;
    }

    // Metode untuk menampilkan informasi nama dan umur
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
