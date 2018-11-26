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
class PersPanjang implements BangunDatar{
    
    double panjang;
    double lebar;
    
    public PersPanjang(double newPanjang, double newLebar){
        panjang = newPanjang;
        lebar = newLebar;
    }
    
    public String getBangunDatar(){
        return "Persegi Panjang";
    }
   
    public double luas(){
        return panjang * lebar;
    }
    
    public double keliling(){
        return 2 * (panjang + lebar);
    }
            
}
