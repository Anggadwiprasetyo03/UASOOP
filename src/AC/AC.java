/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author angga
 */
public class AC implements InterfaceAC {
    
    int statusAC;
    int statusSuhu;
    
    public void matikanAC(){
        if (statusAC == AC_SEKARANG_MENYALA) {
            statusAC = AC_SEKARANG_MATI;
            System.out.println("\nMatikan AC --> AC sudah mati ");
        } else {
            System.out.println("\nMatikan AC --> AC sudah mati, tenang saja");
        }
    }
    
    public void hidupkanAC() {
        if (statusAC == AC_SEKARANG_MATI) {
            statusAC = AC_SEKARANG_MATI;
            System.out.println("\nHidupkan AC --> AC sudah nyala ");
        } else {
            System.out.println("\nHidupkan AC --> AC sudah nyala, udah dingin");
        }
    }
    
    public void dinginkanAC(){
        if (statusAC == AC_SUDAH_PANAS) {
            statusAC = AC_SUDAH_DINGIN;
            System.out.println("\nDinginkan AC --> AC mode dingin ");
        } else {
            System.out.println("\nDinginkan AC --> AC mode dingin, tidak kepanasan lagi");
        }
    }
    
    public void panaskanAC(){
        if (statusAC == AC_SUDAH_DINGIN) {
            statusAC = AC_SUDAH_PANAS;
            System.out.println("\nPanaskan AC --> AC mode panas ");
        } else {
            System.out.println("\nPanaskan AC --> AC mode panas, tidak kedinginan lagi ");
        }
    }
    
}
