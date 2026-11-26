public class Auto extends Fahrzeug implements Versicherbar{

    public Auto(int anzahlSitzpleatze, boolean mietstatus, String farbe, double maximalGeschwindigkeit) {
        super(anzahlSitzpleatze, mietstatus, farbe, maximalGeschwindigkeit);
    }

    @Override
    public double berechneMietPreisProTag() {
        return 30 + getAnzahlSitzpleatze() * 5;
    }

    @Override
    public double berechneVersicherungsPrämie() {
        return 0;
    }
}
