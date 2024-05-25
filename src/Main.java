//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void skorhesapla(String isim, int puan){
        System.out.println(isim + "isimli oyuncunun puanı: " +puan );
    }
    public static void skorhesapla(int puan){
        System.out.println("İsimsiz oyuncunun puanı: " +puan );
    }
    public static void skorhesapla(String isim){
        System.out.println(isim + " isimli oyuncunun puanı yoktur.");
    }
    public static void main(String[] args) {
    //method overloading(method isimleri aynı paramerelerin sayısı veya değişken tipi farklı.)
       skorhesapla("Hüseyin",95);
       skorhesapla(95);
       skorhesapla("Hüseyin");
    }
}