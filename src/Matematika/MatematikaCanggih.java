/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rifqi
 */
public class MatematikaCanggih extends Matematika {

    // Menambahkan metode untuk operasi modulus
    public int modulus(int a, int b) {
        return a % b;
    }

    // Menambahkan metode untuk operasi kombinasi (penjumlahan dan perkalian)
    public int kombinasiTambahKali(int a, int b, int c) {
        return tambah(a, b) * c; // Hasil dari (a + b) * c
    }
}
