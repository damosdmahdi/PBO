/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postest7;

/**
 *
 * @author damos
 */
class Bangunan{
    String nama = "Bangunan umum";
}

class GedungSekolah extends Bangunan{
    String nama = "Gedung Sekolah ABC";
    void printinfo(){
        System.out.println("nama Gedung Sekolah " + nama);
        System.out.println("nama Bangunana " + super.nama);
    }
}






public class detektif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GedungSekolah bangunan1 = new GedungSekolah();
        bangunan1.printinfo();
        
    }
    
}
