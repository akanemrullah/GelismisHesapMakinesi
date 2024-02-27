import java.util.Scanner;

public class Main {

    // Toplama islemi icin yazilan metotumuzdur. Metotlarimiz icin void tipinde ve disaridan degere almayacak sekilde ayarlamalar yapildi.
    static void plus() {
        int result, a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk sayiyi gir: ");
        a = input.nextInt();

        System.out.println("Ikinci sayiyi gir: ");
        b = input.nextInt();

        result = a + b;

        System.out.println("Sonuc: " + result);
    }

    // Cikarma islemi icin yazilan metotumuzdur.
    static void minus() {
        int result, a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk sayiyi gir: ");
        a = input.nextInt();

        System.out.println("Ikinci sayiyi gir: ");
        b = input.nextInt();

        result = a - b;

        System.out.println("Sonuc: " + result);
    }

    // Carpma islemi icin yazilan metottur.
    static void times() {
        int result, a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk sayiyi gir: ");
        a = input.nextInt();

        System.out.println("Ikinci sayiyi gir: ");
        b = input.nextInt();

        result = a * b;

        System.out.println("Sonuc: " + result);
    }

    // Bolme islemi icin yazilan metottur.
    static void divided() {
        int result, a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk sayiyi gir: ");
        a = input.nextInt();

        System.out.println("Ikinci sayiyi gir: ");
        b = input.nextInt();
        if (b == 0) {
            System.out.println("Bolen icin 0 dan farkli bir deger giriniz lutfen.");
        } else {
            result = a / b;

            System.out.println("Sonuc: " + result);
        }
    }

    // Uslu sayilar icin yazilan metottur.
    static void power() {
        int result = 1, a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("Taban degerini gir: ");
        a = input.nextInt();

        System.out.println("Us degerini gir: ");
        b = input.nextInt();

        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        System.out.println("Sonuc: " + result);
    }

    // Faktoriyel hesabi icin yazilan metottur.
    static void factorial() {
        int result = 1, a;

        Scanner input = new Scanner(System.in);

        System.out.println("Faktoriyelini hesaplamak istedigin sayiyi gir: ");
        a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Sonuc: " + result);
    }

    // Mod islemi icin yazilan metottur.
    static void mod() {
        int result, a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("Modunu almak istedigin sayiyi gir: ");
        a = input.nextInt();

        System.out.println("Modun derecesini belirt: ");
        b = input.nextInt();

        result = a % b;

        System.out.println("Sonuc: " + result);
    }

    // Kenar uzunluklari kullanicidan alinan dortgen icin cevre ve alani bu metot ile cozuyoruz.
    static void calc() {
        int result, a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("Dortgenin uzun kenarini gir: ");
        a = input.nextInt();

        System.out.println("Dortgenin kisa kenarini gir: ");
        b = input.nextInt();

        result = 2 * (a + b);
        System.out.println("Kenar uzunluklari belirtilen dortgenin cevresi : " + result);

        result = a * b;
        System.out.println("Kenar uzunluklari belirtilen dortgenin alani : " + result);
    }

    public static void main(String[] args) {

        // Kullanicidan deger almamizi saglayacak olan Scanner sinifi projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        // Kullanicinin secimini tutabilmemiz icin degisken tanimlandi. Secim yapabilmesi icin metni string bir degiskene atadik.
        int select;
        String menu = "1- Toplama İşlemi\n2- Çıkarma İşlemi\n3- Çarpma İşlemi\n4- Bölme işlemi\n5- Üslü Sayı \n6- Faktoriyel \n7- Mod Alma\n8- Dikdörtgen Alan ve Çevre Hesabı\n9- Cikis Yap\nBir islem seciniz: ";

        // while dongusu ile beraber kullanici cikis yapmak istemedigi surece surekli olarak islem yapabilecek. If - else yerine switch - case yapisini tercih ettik.
        while (true) {

            System.out.println(menu);
            select = input.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    calc();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Hatali deger girdiniz!");
            }
            if (select == 9){
            break;
            }
        }
        // Programin sonlandigi mesaji girildi.
        System.out.print("Program sonlandi.");
    }
}