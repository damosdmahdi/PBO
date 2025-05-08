/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak;

class Kendaraaan { // Super Class / Parent Class
    String merk = " Toyota";
    
    Kendaraaan() {
        System.out.println("Ini constructor parent");
    }
    void jalan() {
        System.out.println("Kendaraan sedang berjalan");
    }
}

class Mobil extends  Kendaraaan { // Sub Class / Child Class
    String merk = "BMW";
    Mobil(){
        super(); // Constructor
        System.out.println("Ini constructor child");
    }
    void printinfo(){
        System.out.println("merk mobil child " + merk);
        System.out.println("merk mobil parent" + super.merk);
        jalan();
    }

    Void klakson(String merk) {
        System.out.println("Mobil " + super.merk + " klakson");
        return null;
    }
}




public class main {
    public static void main(String[] args) {
        Mobil jazz = new Mobil();
        //jazz.jalan();
        jazz.printinfo();
        jazz.klakson("BMW");
        System.out.println(jazz.merk);

    }
}
