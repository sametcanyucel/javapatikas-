import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner s=new Scanner(System.in);

        System.out.println("Matematik Notunuz:");
        mat = s.nextInt();
        System.out.println("Fizik Notunuz:");
        fizik = s.nextInt();
        System.out.println("Kimya Notunuz:");
        kimya = s.nextInt();
        System.out.println("Türkçe Notunuz:");
        turkce = s.nextInt();
        System.out.println("Tarih Notunuz:");
        tarih = s.nextInt();
        System.out.println("Müzik Notunuz:");
        muzik = s.nextInt();
        int toplam=mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama=toplam/6.0;
        System.out.println("Ortalamanız  :"+ortalama);



    }
}