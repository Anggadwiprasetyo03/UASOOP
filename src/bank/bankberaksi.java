/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author angga
 */
public class bankberaksi {
    public static void main(String[] args) {
        bank bk = new bank(900000);
        bk.getSaldo();
        bk.simpanSaldo(600000);
        bk.ambilSaldo(200000);
    }
    
}
