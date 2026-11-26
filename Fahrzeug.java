public abstract class Fahrzeug {
    private String kennzeichen;
    private int anzahlSitzplaetze;
    private boolean mietstatus;
    private String farbe;
    private double maximalGeschwindigkeit;

    public Fahrzeug(String kennzeichen, int anzahlSitzplaetze, boolean mietstatus, String farbe, double maximalGeschwindigkeit) {
        this.kennzeichen = kennzeichen;
        this.anzahlSitzplaetze = anzahlSitzplaetze;
        this.mietstatus = mietstatus;
        this.farbe = farbe;
        this.maximalGeschwindigkeit = maximalGeschwindigkeit;
    }

    public abstract double berechneMietPreisProTag();

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getAnzahlSitzplaetze() {
        return anzahlSitzplaetze;
    }

    public void setAnzahlSitzplaetze(int anzahlSitzplaetze) {
        this.anzahlSitzplaetze = anzahlSitzplaetze;
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
                "kennzeichen='" + kennzeichen + '\'' +
                ", anzahlSitzplaetze=" + anzahlSitzplaetze +
                ", mietstatus=" + mietstatus +
                ", farbe='" + farbe + '\'' +
                ", maximalGeschwindigkeit=" + maximalGeschwindigkeit +
                '}';
    }
}
