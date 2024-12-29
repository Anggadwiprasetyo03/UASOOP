/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorBMI;

/**
 *
 * @author angga
 */
public class BMI {
    double hasil;
    
    void kalkulatorBMI(double tinggi, double berat){
        hasil = berat / (tinggi * tinggi);
          
        System.out.println("HASIL BMI angga adalah " + hasil);
        String category = getBMIcategory(hasil);
        System.out.println("kategori BMI: " + category);
        System.out.println("berat badan angga" + berat);
        System.out.println("tinggi angga" + tinggi);
    }
    
    public String getBMIcategory (double hasil){
        if (hasil < 18.5) {
            return "under weight";
        }else if (hasil >=18.5 && hasil < 24.9){
            return "normal weight";
        }else if (hasil >=25 && hasil < 29.9){
            return "over weight";
        }else if (hasil >=30 && hasil>35){
            return "obesity";
        }else {
            return "over obesity";
        }
    }
    
}