/*
 * Copyrigth (c) 2018, All right reserved
 * Written by tauf21, email : taufik.amary@gmail.com
 * Github : tauf21
 */

package Program;

/**
 *
 * @author Taufik Amaryansyah
 */

class lingkaran implements BangunDatar{
    double jari;
    
    public lingkaran (double newJari){
        jari = newJari;
    }

    public String getBangunDatar() {
        return "Lingkaran";
    }

    public double luas() {
        return Math.PI * jari * jari; 
    }

    public double keliling() {
        return Math.PI * 2 * jari;
    }
    
}
