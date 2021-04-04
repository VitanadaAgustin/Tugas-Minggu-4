/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author hp
 */
public class tugas4_B {
     public static void main(String[] args) {
        System.out.println("            Do_While            ");
        System.out.println("  Bilangan kelipatan 2 (1-100)  ");
        System.out.println("================================");

        int angka = 1;
        do {
            System.out.print(angka + "  ");
            angka = angka * 2;
        } while (angka < 100);

    }
    
}
