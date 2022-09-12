import school.docenten.docent;
import school.leerlingen.student;


/**
 * Ik kan mijn scherm bijna niet lezen omdat de zon er direct op schijnt. :(
 *
 * @author jvlen
 * @since 12-09-2022
 */



public class Main {
    public static void main(String[] args) {
        docent d1 = new docent("Hendrik", "Wiel", 56, "Pabo");
        student s1 = new student("Sandra", "Lohmann", 21, "Havo");

        d1.introductie();
        s1.introductie();

        d1.achternaam = "de Berg";

        d1.introductie();

    }
}