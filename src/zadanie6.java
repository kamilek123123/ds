import java.sql.SQLOutput;

public class zadanie6 {
    public static void main(String[] args) {
        int pokoj1, pokoj2, pokoj3, pokoj4, pnaosobe1, pnaosobe2, pnaosobe3, pnaosobe4;

        //pokoj1
        System.out.println("Pokoj 1 ma wymiary 3mx4m ");
        pokoj1=3*4;
        pnaosobe1=(3*4)/4;
        System.out.println("Powierzchnia pokoju 1 to " + pokoj1 + "m2");
        System.out.println("Powierzchnia przypadajaca na jedna osobe to " + pnaosobe1 + "m2");
        System.out.println();

        //pokoj2
        System.out.println("Pokoj 2 ma wymiary 3mx4m ");
        pokoj2=3*4;
        pnaosobe2=(3*4)/4;
        System.out.println("Powierzchnia pokoju 2 to " + pokoj2 + "m2");
        System.out.println("Powierzchnia przypadajaca na jedna osobe to " + pnaosobe2 + "m2");
        System.out.println();

        //pokoj3
        System.out.println("Pokoj 3 ma wymiary 2mx3m ");
        pokoj3=2*3;
        pnaosobe3=(2*3)/4;
        System.out.println("Powierzchnia pokoju 3 to " + pokoj3 + "m2");
        System.out.println("Powierzchnia przypadajaca na jedna osobe to " + pnaosobe3 + "m2");
        System.out.println();

        //pokoj4
        System.out.println("Pokoj 4 ma wymiary 2mx2m ");
        pokoj4=2*2;
        pnaosobe4=(2*2)/4;
        System.out.println("Powierzchnia pokoju 4 to " + pokoj4 + "m2");
        System.out.println("Powierzchnia przypadajaca na jedna osobe to " + pnaosobe4 + "m2");
        System.out.println();
    }
}