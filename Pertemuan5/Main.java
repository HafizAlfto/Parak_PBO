package com.Hafiz.PBO.Pertemuan5;

public class Main {
    public static void Main(String[]arg){

        Barang[] keranjang = new Barang[10];

        Barang[] etalase ={
                new Barang("Indomie", 2000),
                new Barang( "Mie sedap",2000),
                new Barang("Beras", 12000),
                new Barang("Gula",15000)
        };

        //Melihat Panjang Arai
        System.out.println(
                "banyak Baranng Di etalase: " + etalase.length
        );
        etalase[0].snowinfo();

        System.out.println("Daftar Barang Di etalase: ");
        int i = 1;
        for ( Barang barang : etalase){
            System.out.println("Barang ke -" + 1);
            barang.snowinfo();
            i++;
        }
        for (int j=0; j<etalase.length; j++){
            System.out.println("barang ke - :" + (j++) );
            etalase[j].snowinfo();
        }
        keranjang[0];
        System.out.println("Barang di Keranjang :");
        keranjang[0].snowinfo();

    }
    
}
