/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.university.main;
import com.university.model.Student;

/**
 *
 * @author damos
 */

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("S001", "Alice", 20, 3.8);
        students[1] = new Student("S002", "Bob", 22, 3.6);
        students[2] = new Student("S003", "Charlie", 21, 3.9);
        students[3] = new Student("S004", "David", 23, 3.7);
        students[4] = new Student("S005", "Eve", 19, 3.5);

        System.out.println("=== Data Mahasiswa ===");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + ", Nama: " + student.getName() + ", Umur: " + student.getAge() + ", GPA: " + student.getGpa());
        }
    }
}