# Autovermietung

Eine einfache Autovermietung als Konsolenprogramm in Java. Das Programm verwaltet Autos und Motorräder. Man kann alle Fahrzeuge anzeigen, ein Fahrzeug anhand des Kennzeichens mieten oder zurückgeben und alle vermieteten Fahrzeuge anzeigen.

## Starten

In IntelliJ `Main.java` öffnen und auf den grünen Pfeil neben `main` klicken.

Im Menü dann eine Zahl eingeben:

| Eingabe | Funktion |
|---|---|
| 1 | Alle Fahrzeuge anzeigen, mit Mietpreis und Versicherungsprämie |
| 2 | Fahrzeug mieten (Kennzeichen eingeben, z.B. `ZH 123456`) |
| 3 | Fahrzeug zurückgeben |
| 4 | Vermietete Fahrzeuge anzeigen |
| 0 | Beenden |

## Klassen

| Datei | Aufgabe |
|---|---|
| `Fahrzeug.java` | Abstrakte Oberklasse mit Kennzeichen, Sitzplätzen, Mietstatus, Farbe und Höchstgeschwindigkeit |
| `Auto.java`, `Motorrad.java` | Konkrete Fahrzeuge, erben von `Fahrzeug` |
| `Versicherbar.java` | Interface mit `berechneVersicherungsPrämie()` |
| `Autovermietung.java` | Verwaltet die Liste aller Fahrzeuge |
| `Main.java` | Menü in der Konsole |

## Berechnungen

- Mietpreis pro Tag: 30 + Anzahl Sitzplätze × 5
- Versicherungsprämie: 200 + Anzahl Sitzplätze × 0.05

Beispiel Auto mit 5 Sitzplätzen: Mietpreis 30 + 5 × 5 = 55 CHF, Prämie 200 + 5 × 0.05 = 200.25 CHF.

## Wo die Konzepte vorkommen

- **Klasse:** `Auto`, `Motorrad`, `Autovermietung`. Eine Klasse ist der Bauplan, `new Auto(...)` erstellt daraus ein Objekt.
- **Abstrakte Klasse:** `Fahrzeug`. Von ihr kann man kein Objekt erstellen, nur von den Unterklassen. Die Methode `berechneMietPreisProTag()` ist abstrakt, jede Unterklasse muss sie selbst umsetzen.
- **Vererbung:** `Auto extends Fahrzeug` und `Motorrad extends Fahrzeug`. Im Konstruktor wird mit `super(...)` der Konstruktor von `Fahrzeug` aufgerufen.
- **Interface:** `Versicherbar`. `Fahrzeug implements Versicherbar`, damit muss jedes Fahrzeug `berechneVersicherungsPrämie()` haben.
- **Kapselung:** Die Attribute in `Fahrzeug` und die Liste in `Autovermietung` sind `private`. Zugriff gibt es nur über Methoden wie `getKennzeichen()` oder `setMietstatus()`.
- **Polymorphie:** In `Autovermietung.fahrzeugAusgeben()`. Die Liste enthält Objekte vom Typ `Fahrzeug`. Beim Aufruf von `berechneMietPreisProTag()` nimmt Java automatisch die Version von `Auto` oder `Motorrad`, je nachdem, welches Objekt es wirklich ist.

## Vorgehen

Als erstes habe ich den Main.java Code von Confluence abgeschrieben. Das Problem war aber, dass man jedes Word ausschreiben musste. Danach habe ich Martin gefragt und er hat mir gezeigt, wie man es machen muss mit Source Root Ordner.
