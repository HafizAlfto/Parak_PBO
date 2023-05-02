package com.Hafiz.PBO.Pertemuan_3;

public class Main {
    public static void main(String[] args) {
//        SepedaMotor Suzuki = new SepedaMotor();
//        SepedaMotor yamaha = new SepedaMotor();
//        SepedaMotor honda = new SepedaMotor();
//
//        Suzuki.merek = "Suzuki";
//        Suzuki.tipe = "GSx 150 R";
//        Suzuki.harga = 20000000;
//
//        yamaha.merek = "Yamaha";
//        yamaha.tipe = "AEROX 155 Conected";
//        yamaha.harga = 32000000;
//
//        honda.merek = "Honda";
//        honda.tipe = "Rable";
//        honda.harga = 500000000;

//        Suzuki.showInfo();
//        yamaha.showInfo();
//        honda.showInfo();

        SepedaMotor Vespa = new SepedaMotor ( "Vespa", "Vespa Matic", 40000000  );
//        Vespa.showInfo();


        System.out.println("motor merek :" + Vespa.getMerek() + "Dengan Tipe (Before) : " + Vespa.getTipe());

        Vespa.setTipe("Sprint");

        System.out.println("motor merek :" + Vespa.getMerek() + "Dengan Tipe : " + Vespa.getTipe());
    }
}
