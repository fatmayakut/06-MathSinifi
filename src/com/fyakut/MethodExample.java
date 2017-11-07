package com.fyakut;

import java.util.Scanner;

public class MethodExample {
    public static  void main(String... args){

        int kullaniciSecimi=0;

       /* while (kullaniciSecimi!=5){
            kullaniciSecimi=menuGoster
        }*/
       for (;;){
           kullaniciSecimi=menuGoster();
           System.out.println("birinci sayıyı gir");
           Scanner sayiAl=new Scanner(System.in);

           int birincisayi=sayiAl.nextInt();
           System.out.println("ikinci sayıyı gir");
           int ikinciSayi=sayiAl.nextInt();
           if (kullaniciSecimi==5)
               break;

           switch (kullaniciSecimi){
               case 1 :topla(birincisayi,ikinciSayi);
               break;
               case 2:farkbul(birincisayi,ikinciSayi);
                   break;
               case 3:carp(birincisayi,ikinciSayi);
                   break;
               case 4:bol(birincisayi,ikinciSayi);
                   break;
               case 5:break;
           }





       }}

    private static void bol(int birincisayi, int ikinciSayi) {
        int bol=birincisayi/ikinciSayi;
        System.out.println("bol:"+(birincisayi/ikinciSayi));
    }

    private static void carp(int birincisayi, int ikinciSayi) {
        int carp=birincisayi*ikinciSayi;
        System.out.println("carp:"+(birincisayi*ikinciSayi));
    }

    private static void farkbul(int birincisayi, int ikinciSayi) {
        int fark=birincisayi-ikinciSayi;
        System.out.println("fark:"+(birincisayi-ikinciSayi));
    }



    public static void topla(int birincisayi,int ikincisayi){
           int toplam=birincisayi+ikincisayi;
           System.out.println("topla:"+(birincisayi+ikincisayi));
    }



    public static int menuGoster(){
        System.out.println("menu.....");
        System.out.println("1- girilen sayıların toplamı");
        System.out.println("2- girilen sayıların farkı");
        System.out.println("3- girilen sayıların çarpımı");
        System.out.println("4- girilen sayıların bolumu");
        System.out.println("5- cıkıs");
        Scanner deger=new Scanner(System.in);
        int secim=deger.nextInt();
        return secim;
    }
}
