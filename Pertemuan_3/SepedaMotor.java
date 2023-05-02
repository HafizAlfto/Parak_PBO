package com.Hafiz.PBO.Pertemuan_3;

public class SepedaMotor {

    private String merek;
    private String tipe;
    private int harga;

    public SepedaMotor (){}




    public SepedaMotor(String merek, String tipe, int harga) {
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void showInfo() {
        System.out.println("merek: " + merek);
        System.out.println("tipe : " + tipe);
        System.out.println("harga :" + harga);
        System.out.println();
    }


}
