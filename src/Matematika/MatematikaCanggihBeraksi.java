/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rifqi
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mtkCanggih = new MatematikaCanggih();

        System.out.println("Tambah: " + mtkCanggih.tambah(23, 24));
        System.out.println("Kurang: " + mtkCanggih.kurang(20, 30));
        System.out.println("Kali: " + mtkCanggih.kali(40, 35));
        System.out.println("Bagi: " + mtkCanggih.bagi(50, 50));
        System.out.println("Modulus: " + mtkCanggih.modulus(53, 4));
        System.out.println("Kombinasi (Tambah + Kali): " + mtkCanggih.kombinasiTambahKali(55, 35, 300));
    }
}

