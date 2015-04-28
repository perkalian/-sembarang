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
public class ratih {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner (System.in);
        int x, y, z;
        System.out.print("Masukkan Bilangan Pertama : ");
        x = masuk.nextInt();
        System.out.print("Masukkan Bilangan Kedua : ");
        y = masuk.nextInt();
        z = x/y;
        
        System.out.println("Hasil bagi = "+z);
    }
}
