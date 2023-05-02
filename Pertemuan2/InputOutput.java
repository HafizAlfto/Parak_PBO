package com.Hafiz.PBO.Pertemuan2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nama Anda : ");
        String Nama = scanner.nextLine();
        System.out.println("selamat pagi " + Nama);
    }
}
