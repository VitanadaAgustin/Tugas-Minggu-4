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

import java.util.Scanner;
public class Minggu4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int awal, akhir;

        System.out.print("Masukkan angka pertama : ");
        awal = scan.nextInt();
        System.out.print("Masukkan angka terakhir : ");
        akhir = scan.nextInt();

        for (int i = awal; i < akhir; i++ ){
            if (i%2==0){
                System.out.print(i + " ");
    }
    
}
    }
}
