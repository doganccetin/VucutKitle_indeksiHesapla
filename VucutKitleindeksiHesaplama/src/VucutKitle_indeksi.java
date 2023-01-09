import java.util.Scanner;
public class VucutKitle_indeksi {
    public static void main(String[] args) {

        double boy, kitle;
        int kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = input.nextInt();

        kitle = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + kitle + " Olarak Hesaplanmıştır");

    }
}
