public class zadanie22 {
    public static void main(String[]args){
        double cenazakupu = 1000 * 32.87;
        double prowizjadlabrokera = cenazakupu * 0.02;
        double cenasprzedazy = 1000 * 33.92;
        double prowizjadlabrokera2 = cenasprzedazy * 0.02;
        double zysk = (cenasprzedazy - prowizjadlabrokera2) - (cenazakupu - prowizjadlabrokera);
        System.out.println("cena zakupu : : " +cenazakupu);
        System.out.println("prowizja dla brokera przy zakupie : " +prowizjadlabrokera);
        System.out.println("cena sprzedazy : " +cenasprzedazy);
        System.out.println("prowizja dla brokera przy sprzedazy : " +prowizjadlabrokera2);
        System.out.println("zysk : " +zysk);
    }
}
