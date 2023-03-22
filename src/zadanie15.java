import java.util.Scanner;

public class zadanie15 {
    public static void main(String[] args) {
        int plytka;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj cene detaliczna plytki: ");
        plytka= dane.nextInt();
        double zysk= plytka * 0.4;
        System.out.println("zysk na plytce wynosi : " + zysk);

    }
}