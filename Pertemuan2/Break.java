package com.Hafiz.PBO.Pertemuan2;

public class Break {
    public static void main(String[] args) {
        int p = 0;
        while (p <= 100){
            System.out.println("Perulangan ke-" + p);
            if (p == 10){
                System.out.println("NT TERUSS BROO !!");
                break ;
            }
            p += 2;
        }
    }
}
