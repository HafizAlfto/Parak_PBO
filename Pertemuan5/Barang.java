package com.Hafiz.PBO.Pertemuan5;

public class Barang {
    //atribut
    String nama;
    int harga;

    //constuktor
    public Barang(){}

    public Barang(String nama, int harga){
        this.nama = nama;
        this.harga =harga;
    }

    //metod
    public void snowinfo(){
        System.out.println("nama Barang : "+ this.nama);
        System.out.println("harga Barang :"+ this.harga);
        System.out.println();
    }
}
