package school.docenten;

public class docent {
    public static String voornaam;
    public static String achternaam;
    public static int leeftijd;
    static String vooropleiding;
    static final boolean mens = true;

    public docent (String voornaam, String achternaam, int leeftijd, String vooropleiding) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.leeftijd = leeftijd;
        this. vooropleiding = vooropleiding;
    }

    // Dit persoon stelt zich voor.
    public void introductie() {
        System.out.println("Ik ben " + voornaam + " " + achternaam + ". Ik ben " + leeftijd + " jaar oud. Voordat ik leraar ben geworden heb ik de " + vooropleiding + " afgerond.");
    }
}
