/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author damos
 */
public class latihan {
    public static void main(String[] args){
        String[] abdjad = {"a","i","u","e","o"};
        
        boolean gg;
        
        if(abdjad.length == 5){
            if (abdjad.length % 2 == 0) {
                gg = true;
                System.out.println("bilangannya genap");
            }else{
                gg = false;
                System.out.println("bilangannya ganjil");
            }
            System.out.println("jumlah abdjad lengkap");
        }else{
            System.out.println("jumlah tidak lengkap");
        }
        
        switch(gg) {
            case true:
              // code block
                System.out.println("bilangannya genap");
              break;
            case false:
              // code block
                System.out.println("bilangannya ganji;");
              break;
          }
        for (String huruf : abdjad) {
            System.out.println(huruf);
        }
    }
}
