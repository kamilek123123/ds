import java.util.Scanner;
public class zadanie10 {
    public static void main(String[] args) {
        String pimie, dimie, nazwisko;

        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj swoję imię: ");
        pimie = dane.nextLine();

        System.out.println("Podaj swoję drugie imię: ");
        dimie = dane.nextLine();

        System.out.println("Podaj swoję nazwisko: ");
        nazwisko = dane.nextLine();

        char firstInitial = pimie.charAt(0), middleInitial = dimie.charAt(0), lastInitial = nazwisko.charAt(0);

        System.out.println("Twoje imie: " + pimie + ". drugie imie: " + dimie + ". nazwisko: " + nazwisko);
        System.out.println("Twoje inicjaly: " + firstInitial + middleInitial + lastInitial);
    }
}