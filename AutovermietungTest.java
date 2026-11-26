public class AutovermietungTest {
    private static int fehler = 0;

    public static void main(String[] args) {
        testMietpreis();
        testVersicherungspraemie();
        testSucheNachKennzeichen();
        testMietstatus();

        System.out.println();
        if (fehler == 0) {
            System.out.println("Alle Tests bestanden.");
        } else {
            System.out.println(fehler + " Test(s) fehlgeschlagen.");
        }
    }

    private static void testMietpreis() {
        Auto auto = new Auto("ZH 1", 5, false, "rot", 180);
        Motorrad motorrad = new Motorrad("ZH 2", 2, false, "schwarz", 220);

        pruefe("Mietpreis Auto mit 5 Plätzen ist 55", gleich(auto.berechneMietPreisProTag(), 55));
        pruefe("Mietpreis Motorrad mit 2 Plätzen ist 40", gleich(motorrad.berechneMietPreisProTag(), 40));
    }

    private static void testVersicherungspraemie() {
        Auto auto = new Auto("ZH 1", 5, false, "rot", 180);
        Motorrad motorrad = new Motorrad("ZH 2", 2, false, "schwarz", 220);

        pruefe("Prämie Auto mit 5 Plätzen ist 200.25", gleich(auto.berechneVersicherungsPrämie(), 200.25));
        pruefe("Prämie Motorrad mit 2 Plätzen ist 200.1", gleich(motorrad.berechneVersicherungsPrämie(), 200.1));
    }

    private static void testSucheNachKennzeichen() {
        Autovermietung vermietung = new Autovermietung();
        Auto auto = new Auto("ZH 123456", 5, false, "rot", 180);
        vermietung.fahrzeugHinzufuegen(auto);

        pruefe("Suche findet hinzugefügtes Fahrzeug", vermietung.sucheNachKennzeichen("ZH 123456") == auto);
        pruefe("Suche gibt null bei unbekanntem Kennzeichen", vermietung.sucheNachKennzeichen("XX 000") == null);
    }

    private static void testMietstatus() {
        Auto auto = new Auto("ZH 1", 5, false, "rot", 180);

        pruefe("Neues Fahrzeug ist nicht vermietet", !auto.isMietstatus());
        auto.setMietstatus(true);
        pruefe("Nach dem Mieten ist es vermietet", auto.isMietstatus());
        auto.setMietstatus(false);
        pruefe("Nach der Rückgabe ist es wieder frei", !auto.isMietstatus());
    }

    private static boolean gleich(double ist, double soll) {
        return Math.abs(ist - soll) < 0.0001;
    }

    private static void pruefe(String beschreibung, boolean bestanden) {
        if (bestanden) {
            System.out.println("OK      " + beschreibung);
        } else {
            System.out.println("FEHLER  " + beschreibung);
            fehler++;
        }
    }
}
