import java.util.Scanner;

public class zadanie14 {
    public static void main(String[] args) {
        int test1, test2, test3;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj ocene z 1 testu: ");
        test1= dane.nextInt();
        System.out.println("Podaj ocene z 2 testu: ");
        test2= dane.nextInt();
        System.out.println("Podaj ocene z 3 testu: ");
        test3= dane.nextInt();
        int srednia= (test1+test2+test3)/3;
        System.out.println("twoje oceny : " +test1+", "+test2+ ", "+test3);
        System.out.println("srednia ocen to : " + srednia);

    }
}