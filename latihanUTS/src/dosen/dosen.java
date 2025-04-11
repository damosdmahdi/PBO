/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosen;

/**
 *
 * @author damos
 */
public class dosen {
    private String nama;
    private String NIDN;
    
    dosen(String nama, String NIDN){
        this.nama = nama;
        this.NIDN = NIDN;
        
    
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNIDN(){
        return NIDN;
    }
}
