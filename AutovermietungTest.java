import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AutovermietungTest {

    // Prüft, ob die Suche ein Auto findet, auch wenn das Kennzeichen klein und mit Leerzeichen eingegeben wird.
    @Test
    void sucheFindetAutoTrotzKleinschreibungUndLeerzeichen() {
        Autovermietung vermietung = new Autovermietung();
        Auto auto = new Auto("ZH 123456", 5, false, "rot", 180);
        vermietung.fahrzeugHinzufuegen(auto);

        Fahrzeug gefunden = vermietung.sucheNachKennzeichen(" zh 123456 ");

        assertEquals(auto, gefunden);
    }

    // Prüft, ob die Suche null zurückgibt, wenn es das Kennzeichen nicht gibt.
    @Test
    void sucheGibtNullBeiUnbekanntemKennzeichen() {
        Autovermietung vermietung = new Autovermietung();
        vermietung.fahrzeugHinzufuegen(new Auto("ZH 123456", 5, false, "rot", 180));

        Fahrzeug gefunden = vermietung.sucheNachKennzeichen("XX 000");

        assertNull(gefunden);
    }

    // Prüft, ob ein Auto mit 5 Sitzplätzen einen Mietpreis von 55.0 pro Tag hat.
    @Test
    void mietpreisAutoMitFuenfSitzplaetzenIst55() {
        Auto auto = new Auto("ZH 123456", 5, false, "rot", 180);

        assertEquals(55.0, auto.berechneMietPreisProTag(), 0.001);
    }

    // Prüft, ob ein Motorrad mit 2 Sitzplätzen eine Versicherungsprämie von 200.10 hat.
    @Test
    void versicherungsPraemieMotorradMitZweiSitzplaetzenIst200Komma10() {
        Motorrad motorrad = new Motorrad("LU 4321", 2, false, "schwarz", 220);

        assertEquals(200.10, motorrad.berechneVersicherungsPrämie(), 0.001);
    }
}
