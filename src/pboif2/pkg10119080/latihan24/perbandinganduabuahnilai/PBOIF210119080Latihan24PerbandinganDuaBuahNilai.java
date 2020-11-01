/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Perbandingan Dua Buah Nilai
 */
public class PBOIF210119080Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai1, nilai2, hasil;
        String pilihan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("========Program Perbandingan Nilai========");
        do {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = scanner.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            nilai2 = scanner.nextInt();
            if (nilai1 < nilai2) {
                System.out.printf("Hasil : %1$d Lebih kecil dari %2$d%n", nilai1, nilai2);
            }
            if (nilai1 > nilai2) {
                System.out.printf("Hasil : %1$d Lebih besar dari %2$d%n", nilai1, nilai2);
            }
            if (nilai1 == nilai2) {
                System.out.printf("Hasil : %1$d Sama dengan %2$d%n", nilai1, nilai2);
            }
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            pilihan = scanner.next();
            System.out.println();
        } while (pilihan.equals("ya") || pilihan.equals("Ya"));
    }
    
}