public class Auto extends Fahrzeug implements Versicherbar{

    public Auto(int anzahlSitzplaetze, boolean mietstatus, String farbe, double maximalGeschwindigkeit) {
        super(anzahlSitzplaetze, mietstatus, farbe, maximalGeschwindigkeit);
    }

    @Override
    public double berechneMietPreisProTag() {
        return 30 + getAnzahlSitzplaetze() * 5;
    }

    @Override
    public double berechneVersicherungsPrämie() {
        return 0;
    }
}
