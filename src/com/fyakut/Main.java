package com.fyakut;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * matematiksel değerleri donüştürür
         */
      /*  System.out.println(Math.PI);
        System.out.println(Math.abs(-40));// abs mutlak değer sonrasını verir
        System.out.println(Math.ceil(8.3));//veerilen sayıyı bir üst tam sayıya dondurur=9.0
        System.out.println(Math.pow(2,3));//sayının kuvvetini verir 2 nin 3 kuvveti=8 verir
        System.out.println(Math.sqrt(4));// verilen sayının karekökünu verir =16
        System.out.println(Math.max(11,12));//verilen sayılardan büyük olanı verir=12
        System.out.println(Math.min(11,12));//verilen sayılardan küçük  olanı verir=11

        System.out.println(Math.random());//0-1 rastgele bir sayı üretir*/

//        //sorular
//        // soru-1 dik kenarları x olan ikizkenar üçgenin alanını bulunuz
//        //soru -2 0ile 50 arasındaüretilen rastgele iki sayının büyük olanını veriniz
//        System.out.println("kenar giriniz");
//        Scanner kenarAl=new Scanner(System.in);
//        int kenar1=kenarAl.nextInt();
//
//int kenar2=kenar1;
//
//double alan=Math.pow(kenar1,2)/2;
//        System.out.println("alan"+alan);
//cevap 2

        int x,y;
        x=(int)(Math.random()*50);
        y=(int)(Math.random()*50);
        System.out.println("max sayı"+Math.max(x,y));
        System.out.println("min sayi"+Math.min(x,y));
    }
}
