/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan7;

/**
 *
 * @author damos
 */

class hewan{
    String hewan;
    void suarahewan() {
        System.out.println("minta codingan dong");
    }
}

class kucing extends hewan{
    String kucing;
    void suarakucing() {
        System.out.println("meong");
    }
}


public class latihan1 {
    public static void main(String[] args) {
        // TODO code application logic here
        hewan hewan1 = new hewan();
        hewan1.suarahewan();
        kucing kucing1 = new kucing();
        kucing1.suarakucing();
        
    }
    
}



