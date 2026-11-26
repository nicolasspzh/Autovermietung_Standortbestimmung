public class Motorrad extends Fahrzeug implements Versicherbar{

    public Motorrad(int anzahlSitzpleatze, boolean mietstatus, String farbe, double maximalGeschwindigkeit) {
        super(anzahlSitzpleatze, mietstatus, farbe, maximalGeschwindigkeit);
    }

    @Override
    public double berechneMietPreisProTag() {
        return 30 + getAnzahlSitzpleatze() * 5;
    }

    @Override
    public double berechneVersicherungsPrämie() {
        return 200 + getAnzahlSitzpleatze() * 0.05;
    }
}
