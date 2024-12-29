/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author angga
 */
public class AcBeraksi {
    public static void main(String[] args) {
        AC acAngga = new AC();
     
        System.out.println("SAAT INI AC SUDAH : MATI");
        acAngga.hidupkanAC();
        acAngga.matikanAC();
        acAngga.matikanAC();
        acAngga.hidupkanAC();
        acAngga.hidupkanAC();
        
        System.out.println("\nSAAT INI AC SUDAH : panas");
        acAngga.dinginkanAC();
        acAngga.panaskanAC();
        acAngga.panaskanAC();
        acAngga.dinginkanAC();
        acAngga.dinginkanAC();
       
       
        
    }
    
}