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
public class Main {

    static void printBangDatar(BangunDatar bdr){
        System.out.println("=================================");
        System.out.println("Bangun Datar    = "+bdr.getBangunDatar());
        System.out.println("Luas            = "+bdr.luas());
        System.out.println("Keliling        = "+bdr.keliling());
        System.out.println("=================================");
    }
    
    static void mainUtama(){
        BangunDatar BangDatar = new PersPanjang(10, 20);
        printBangDatar(BangDatar);
        BangDatar = new Persegi(10);
        printBangDatar(BangDatar);
        BangDatar = new lingkaran(7);
        printBangDatar(BangDatar);
        
    }
    
    public static void main(String[] args) {
        mainUtama();
    }

}
