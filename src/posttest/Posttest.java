/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author damos
 */
public class Posttest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();
        double umurdouble  = (double) umur;

        System.out.print("Masukkan uang yang dimiliki Anda: ");
        double Uang = input.nextDouble();
        int Uangint = (int) Uang;

        System.out.print("Masukkan rata rata uang dikeluarkan Anda: ");
        double ratarata = input.nextDouble();
        Math.ceil(ratarata);
        
        double sisauang = (ratarata * 30) / Uang;
        System.out.print("Sisa uang dalam 30 hari : " + sisauang);
        
        double estimasibulanan;
        estimasibulanan = Uang / (ratarata * 30);
        if(estimasibulanan < 1){
            System.out.print("keuangan anada kurang stabil " + estimasibulanan);
        }else{
            System.out.print("estimasi bulanan : " + estimasibulanan);
        }
        
        System.out.print("Masukkan hutang yang dimiliki Anda: ");
        double hutang = input.nextDouble();
        
        double absoluteDifference = Math.abs(hutang);
        Random random = new Random();  
        double batasBawah = 100000;  
        double batasAtas = 1000000;  
 
        double angkaAcak = random.nextDouble(batasAtas - batasBawah + 1) + batasBawah;  

        System.out.println("bonus acaknya adalah : " + angkaAcak);
        
        
        boolean resultumur;
        if(umur > 30){
            resultumur = false;
        }else{
            resultumur = true;
        }
        
        boolean result;
        if(resultumur = false && Uang > 10000000){
            result = false;
        }else if(resultumur = true || Uang > 5000000){
            result = true;
        }
        
        Double totaluang = sisauang + angkaAcak;
        
        System.out.println("total uang yang sudah dimiliki : " + totaluang);
        
        
        
        
    }
    
}
