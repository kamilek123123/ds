import java.util.Scanner;
public class zadanie11 {
    public static void main(String[] args) {
        int wartoscproduktu;
        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj wartosc produktu: ");
        wartoscproduktu = dane.nextInt();
        dane.nextLine();

        double podateks=wartoscproduktu*0.04;
        double podatekl=wartoscproduktu*0.02;
        double wartosccalkowita= wartoscproduktu+podateks+podatekl;

        System.out.println("Cena Ostateczna : " + wartosccalkowita);
        System.out.println("Podatek stanowy :  "  + podateks +  "  Podatek lokalny:  "  + podatekl);
    }
}
