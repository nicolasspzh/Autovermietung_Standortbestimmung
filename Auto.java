public class Auto extends Fahrzeug implements Versicherbar{

    public Auto(String kennzeichen, int anzahlSitzplaetze, boolean mietstatus, String farbe, double maximalGeschwindigkeit) {
        super(kennzeichen, anzahlSitzplaetze, mietstatus, farbe, maximalGeschwindigkeit);
    }

    @Override
    public double berechneMietPreisProTag() {
        return 30 + getAnzahlSitzplaetze() * 5;
    }

    @Override
    public double berechneVersicherungsPrämie() {
        return 200 + getAnzahlSitzplaetze() * 0.05;
    }
}
