import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int  dlugosc1;
        System.out.println("Podaj dlugosc pokoju nr 1 :");
        dlugosc1 = klawisz.nextInt();
        klawisz.nextLine();
        int szerokosc1;
        System.out.println("Podaj szerokosc pokoju nr 1 :");
        szerokosc1 = klawisz.nextInt();
        klawisz.nextLine();

        int dlugosc2;
        System.out.println("Podaj dlugosc pokoju nr 2 :");
        dlugosc2 = klawisz.nextInt();
        klawisz.nextLine();
        int szerokosc2;
        System.out.println("Podaj szerokosc pokoju nr 2 :");
        szerokosc2 = klawisz.nextInt();
        klawisz.nextLine();

        int dlugosc3;
        System.out.println("Podaj dlugosc pokoju nr 3 :");
        dlugosc3 = klawisz.nextInt();
        klawisz.nextLine();
        int szerokosc3;
        System.out.println("Podaj szerokosc pokoju nr 3 :");
        szerokosc3 = klawisz.nextInt();
        klawisz.nextLine();

        int dlugosc4 ;
        System.out.println("Podaj dlugosc pokoju nr 4 :");
        dlugosc4= klawisz.nextInt();
        klawisz.nextLine();
        int szerokosc4;
        System.out.println("Podaj szerokosc pokoju nr 4 :");
        szerokosc4 = klawisz.nextInt();
        klawisz.nextLine();

        int powierzchnia1 = dlugosc1*szerokosc1;
        int powierzchnia2 = dlugosc2*szerokosc2;
        int powierzchnia3= dlugosc3*szerokosc3;
        int powierzchnia4 = dlugosc4*szerokosc4;

        System.out.println("Pokój nr 1 ma wymiary " + dlugosc1 + "x" + szerokosc1 + "Natomiast powierzchnia wynosi "+ powierzchnia1 + "Metrów^2");
        System.out.println("Pokój nr 2ma wymiary " + dlugosc2 + "x" + szerokosc2+ "Natomiast powierzchnia wynosi "+ powierzchnia2 + "Metrów^2");
        System.out.println("Pokój nr 3 ma wymiary " + dlugosc3 + "x" + szerokosc3+ "Natomiast powierzchnia wynosi "+ powierzchnia3 + "Metrów^2");
        System.out.println("Pokój nr 4ma wymiary " + dlugosc4 + "x" + szerokosc4+  "Natomiast powierzchnia wynosi " + powierzchnia4 + "Metrów^2");

    }
}