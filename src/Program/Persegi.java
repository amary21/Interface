/*
 * Copyrigth (c) 2018, All right reserved
 * Written by tauf21, email : taufik.amary@gmail.com
 * Github : tauf21
 */

package Program;

/**
 *
 * @author root
 */
class Persegi implements BangunDatar{
    double sisi;
    
    public Persegi (double newSisi){
        sisi = newSisi;
    }

    public String getBangunDatar() {
        return "Persegi"; 
    }
    public double luas() {
        return sisi * sisi; 
    }
    public double keliling() {
        return 4 * sisi; 
    }
    
    
}
