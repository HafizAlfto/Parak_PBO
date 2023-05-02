package com.Hafiz.PBO.Pertemuan2;

public class Looping {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println( "Perulangan for ke - " + i);
        }
        System.out.println("Selesai perulangan for");

        int j = 0;
        while (j < 10){
            System.out.println("Perulangan while ke-" + j);
            j++;
        }
        System.out.println("Perulangan while");

        int K = 0;
        do {
            System.out.println("Perulangan do-while ke-" + K);
            K++;
        }while (K < 10);
        System.out.println("Selesai Perulangan do-while");
    }
}
