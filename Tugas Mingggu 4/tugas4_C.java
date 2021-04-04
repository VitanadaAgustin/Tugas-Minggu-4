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

public class tugas4_C {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int banyakData;

        System.out.print("Masukkan banyaknya data nilai = ");
        banyakData = scan.nextInt();

        int nilai[] = new int[banyakData];
        int nilaiTotal = 0;

        for (int i = 0; i < banyakData; i++){
            System.out.print("Masukkan data nilai ke-"+ (i+1) + " = " );
            nilai[i] = scan.nextInt();

            nilaiTotal += nilai[i];
        }

        int nilaiMax = nilai[0];
        for (int i = 0; i < nilai.length; i++){
            if (nilaiMax < nilai[i]){
                nilaiMax = nilai[i];
            }
        }

        int nilaiMin = nilai[0];
        for (int i = 0; i < nilai.length; i++){
            if (nilaiMin > nilai[i]){
                nilaiMin = nilai[i];
            }
        }

        double rataRata;
        double banyak = banyakData;
        rataRata = nilaiTotal / banyak;

        System.out.println(" ");
        System.out.println("Nilai Minimum = " + nilaiMin);
        System.out.println("Nilai Maksimum = " + nilaiMax);
        System.out.println("Nilai rata-ratanya adalah = " + rataRata);

    }
}
