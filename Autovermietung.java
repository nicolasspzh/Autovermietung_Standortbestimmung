import java.util.ArrayList;

public class Autovermietung {
    private ArrayList<Fahrzeug> fahrzeuge = new ArrayList<>();

    public void fahrzeugHinzufuegen(Fahrzeug fahrzeug) {
        fahrzeuge.add(fahrzeug);
    }

    public void alleFahrzeugeAnzeigen() {
        if (fahrzeuge.isEmpty()) {
            System.out.println("Es sind keine Fahrzeuge vorhanden.");
            return;
        }
        for (Fahrzeug fahrzeug : fahrzeuge) {
            fahrzeugAusgeben(fahrzeug);
        }
    }

    public void pruefeObFahrzeugVermietet() {
        boolean mindestensEinesVermietet = false;
        for (Fahrzeug fahrzeug : fahrzeuge) {
            if (fahrzeug.isMietstatus()) {
                fahrzeugAusgeben(fahrzeug);
                mindestensEinesVermietet = true;
            }
        }
        if (!mindestensEinesVermietet) {
            System.out.println("Momentan ist kein Fahrzeug vermietet.");
        }
    }

    public Fahrzeug sucheNachKennzeichen(String kennzeichen) {
        for (Fahrzeug fahrzeug : fahrzeuge) {
            if (fahrzeug.getKennzeichen().equalsIgnoreCase(kennzeichen.trim())) {
                return fahrzeug;
            }
        }
        return null;
    }

    // Polymorphie: berechneMietPreisProTag() und berechneVersicherungsPrämie()
    // werden auf einem Fahrzeug aufgerufen. Java nimmt automatisch die Version
    // von Auto oder Motorrad, je nachdem, welches Objekt in der Liste steckt.
    private void fahrzeugAusgeben(Fahrzeug fahrzeug) {
        String status = fahrzeug.isMietstatus() ? "vermietet" : "frei";
        System.out.println(fahrzeug.getClass().getSimpleName()
                + " | " + fahrzeug.getKennzeichen()
                + " | " + fahrzeug.getFarbe()
                + " | " + fahrzeug.getAnzahlSitzplaetze() + " Sitzplätze"
                + " | " + status
                + " | Mietpreis/Tag: " + String.format("%.2f", fahrzeug.berechneMietPreisProTag()) + " CHF"
                + " | Versicherung: " + String.format("%.2f", fahrzeug.berechneVersicherungsPrämie()) + " CHF");
    }
}
