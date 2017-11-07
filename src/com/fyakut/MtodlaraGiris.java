package com.fyakut;

public class MtodlaraGiris {
    public static void main(String... args) {
/**
 * belli bir amacı gerçekleştren kod parçacıklarıdır. eylemı yapan kıksımdr. işlemleri tek bir ad altında da toplamak da olabilir
 */
menuGoster();//metot ile main i haberleştr parametresiz

      toplaminibul(5,6);  // paramatre vermek istiyor isem ilk olarak metoda gidip parametre değişkeni verilmelidr


int fark=farkiniBul(5,9);
        System.out.println("farkını bul"+fark);

    }
public static  void menuGoster(){//metod void olarak tanımlandığı için geriye birşey donderme demektir.
        System.out.println("menül:");
        System.out.println("1-iki sayının toplamını bul:");
        System.out.println("2-iki sayının farkını bul:");
        System.out.println("3-iki sayının carpımını bul:");}

        public static  void toplaminibul(int a,int b){//parametre alan ama geriye herhangi bir değer dondermeyen bir metod
    int toplam=a+b;
            System.out.println("toplam:"+toplam);//bu geriye dondermek değil var olanı ekrana yazdırmaktır
        }
        public static  int farkiniBul(int c,int d){//metod int tanımlandığı için deger geri donderiri  bu durumda return kullanılmalıdır
            int fark=c-d;
return fark;//int deger doner

        }
}
