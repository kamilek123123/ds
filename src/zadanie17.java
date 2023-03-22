import java.util.Scanner;

public class zadanie17 {
    public static void main(String[] args) {
        int cenaposilku;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj cene posilku: ");
        cenaposilku= dane.nextInt();
        double podatek = cenaposilku * 0.0675;
        double napiwek = cenaposilku * 0.20;
        double cenakoncowa = cenaposilku + podatek + napiwek;
        System.out.println("cena posilku to : " +cenaposilku);
        System.out.println("wartosc podatku to : " +podatek);
        System.out.println("wartosc napiwku to : " +napiwek);
        System.out.println("cena koncowa to : " +cenakoncowa);



    }
}