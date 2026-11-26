public abstract class Fahrzeug extends Autovermietung{
    private int anzahlSitzpleatze;
    private boolean mietstatus;
    private String farbe;
    private double maximalGeschwindigkeit;

    public Fahrzeug(int anzahlSitzpleatze, boolean mietstatus, String farbe, double maximalGeschwindigkeit) {
        this.anzahlSitzpleatze = anzahlSitzpleatze;
        this.mietstatus = mietstatus;
        this.farbe = farbe;
        this.maximalGeschwindigkeit = maximalGeschwindigkeit;
    }

    public abstract double berechneMietPreisProTag();

    public int getAnzahlSitzpleatze() {
        return anzahlSitzpleatze;
    }

    public void setAnzahlSitzpleatze(int anzahlSitzpleatze) {
        this.anzahlSitzpleatze = anzahlSitzpleatze;
    }

    public boolean isMietstatus() {
        return mietstatus;
    }

    public void setMietstatus(boolean mietstatus) {
        this.mietstatus = mietstatus;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public double getMaximalGeschwindigkeit() {
        return maximalGeschwindigkeit;
    }

    public void setMaximalGeschwindigkeit(double maximalGeschwindigkeit) {
        this.maximalGeschwindigkeit = maximalGeschwindigkeit;
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "anzahlSitzpleatze=" + anzahlSitzpleatze +
                ", mietstatus=" + mietstatus +
                ", farbe='" + farbe + '\'' +
                ", maximalGeschwindigkeit=" + maximalGeschwindigkeit +
                '}';
    }
}
