/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package match;

import java.util.Scanner;

/**
 *
 * @author SBC4
 */
public class koko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner (System.in);
        int a, b, c;
        System.out.print("Masukkan Bilangan Pertama : ");
        a = masuk.nextInt();
        System.out.print("Masukkan Bilangan Kedua : ");
        b = masuk.nextInt();
        c = a*b;
        
        System.out.println("Hasil = "+c);
    }
}
