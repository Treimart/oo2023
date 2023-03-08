public class Main {
    public static void main(String[] args) {
        Sportlane sportlane1 = new Sportlane("Jakobson", "Kaalikas","Mees","14");
        Tulemus tulemus1 = new Tulemus(sportlane1, 72, 65, 672);
        Elukoht elukoht1 = new Elukoht(sportlane1, "Eesti", "Tallinn");

        Sportlane sportlane2 = new Sportlane("Mariks", "Vaasik","Naine","7");
        Tulemus tulemus2 = new Tulemus(sportlane2, 67, 70, 686);
        Elukoht elukoht2 = new Elukoht(sportlane2, "Läti", "Riia");

        double punktid1 = tulemus1.panePunktidesse();
        System.out.println(punktid1);

        double punktid2 = tulemus2.panePunktidesse();
        System.out.println(punktid2);
    }
}