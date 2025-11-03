/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal1sedang;
import java.util.Scanner;
import java.math.BigInteger;



/**
 *
 * @author USER
 */
public class Soal1sedang {

public class HitungFaktorial {
   // Fungsi untuk menghitung faktorial
    public static long faktorial(int n){
        long hasil = 1;
        for (int i = 1; i <= n; i++){
            hasil *=i;
            
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif");
        int angka = input.nextInt();
        
        if (angka < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long hasil = faktorial(angka);
            System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
        }
    }  
    }
}

        
    
