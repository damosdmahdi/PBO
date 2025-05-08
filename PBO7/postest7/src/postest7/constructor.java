/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest7;

/**
 *
 * @author damos
 */

class Orang{
    Orang(){
        System.out.println("Orang dibuat");
    }
}
class Dosen extends Orang{
    Dosen(){
        super();
        System.out.println("Dosen dibuat");
    }
    
}



public class constructor {
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen1 = new Dosen();
        System.out.println(dosen1);
    }
}
