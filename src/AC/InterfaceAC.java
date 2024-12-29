/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author angga
 */
public interface InterfaceAC {
    
    public static int AC_SEKARANG_MATI = 0;
    public static int AC_SEKARANG_MENYALA = 1;
    public static int AC_SUDAH_DINGIN = 0;
    public static int AC_SUDAH_PANAS = 1;
    
    public abstract void matikanAC();
    public abstract void hidupkanAC();
    public abstract void dinginkanAC();
    public abstract void panaskanAC();
    
    

    
}