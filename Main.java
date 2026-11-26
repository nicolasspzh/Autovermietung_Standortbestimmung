public class Main {
    public static void main(String[] args) {
        Autovermietung vermietung = new Autovermietung();

        vermietung.fahrzeugHinzufuegen(new Auto("ZH 123456", 5, false, "rot", 180));
        vermietung.fahrzeugHinzufuegen(new Auto("BE 98765", 7, false, "weiss", 170));
        vermietung.fahrzeugHinzufuegen(new Motorrad("LU 4321", 2, false, "schwarz", 220));
        vermietung.fahrzeugHinzufuegen(new Motorrad("SG 555", 1, false, "blau", 190));

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean weiter = true;

        while (weiter) {
            System.out.println("===Autovermietung Menü ===");
            System.out.println("1) Alle Fahrzeuge anzeigen");
            System.out.println("2) Fahrzeug mieten anhand Kennzeichen");
            System.out.println("3) Fahrzeuge zurückgeben anhand Kennzeichen");
            System.out.println("4) Vermietete Fahrzeuge anzeigen");
            System.out.println("0) Beenden");
            System.out.println("Auswahl: ");

            String eingabe = scanner.nextLine();

            switch (eingabe) {
                case "1":
                    vermietung.alleFahrzeugeAnzeigen();
                    break;
                case "2": {
                    System.out.println("Kennzeichen eingeben: ");
                    Fahrzeug fahrzeug = vermietung.sucheNachKennzeichen(scanner.nextLine());
                    if (fahrzeug == null) {
                        System.out.println("Kein Fahrzeug mit diesem Kennzeichen gefunden.");
                    } else if (fahrzeug.isMietstatus()) {
                        System.out.println("Dieses Fahrzeug ist bereits vermietet.");
                    } else {
                        fahrzeug.setMietstatus(true);
                        System.out.println("Fahrzeug " + fahrzeug.getKennzeichen() + " wurde vermietet. Preis pro Tag: "
                                + String.format("%.2f", fahrzeug.berechneMietPreisProTag()) + " CHF");
                    }
                    break;
                }
                case "3": {
                    System.out.println("Kennzeichen eingeben: ");
                    Fahrzeug fahrzeug = vermietung.sucheNachKennzeichen(scanner.nextLine());
                    if (fahrzeug == null) {
                        System.out.println("Kein Fahrzeug mit diesem Kennzeichen gefunden.");
                    } else if (!fahrzeug.isMietstatus()) {
                        System.out.println("Dieses Fahrzeug ist nicht vermietet.");
                    } else {
                        fahrzeug.setMietstatus(false);
                        System.out.println("Fahrzeug " + fahrzeug.getKennzeichen() + " wurde zurückgegeben.");
                    }
                    break;
                }
                case "4":
                    vermietung.pruefeObFahrzeugVermietet();
                    break;
                case "0":
                    weiter = false;
                    System.out.println("Programm wird beendet.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Bitte 0, 1, 2, 3 oder 4 wählen.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
