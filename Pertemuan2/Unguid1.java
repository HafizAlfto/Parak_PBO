package com.Hafiz.PBO.Pertemuan2;

import java.util.Scanner;

public class Unguid1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;

        System.out.print("Input batas billangan :");
        bilangan = input.nextInt();

        System.out.println("-- Program menampilkan Bilangan genap --");
        for (int i = 1; i <= bilangan; i++) {
            if (i % 2 == 0) {
                System.out.println("Bilangan Genap-" + i);
            }
        }
        input.close();
    }
}
