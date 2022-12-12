public class Buchung {
    private int buchungsNr;
    private static int zaehler = 0;
    private int anzahlSchueler;
    private Lehrer verantwortlicher;
    private Studienfahrt Studienfahrt;

    public Buchung(String verantwortlicher, String fahrt){
        buchungsNr = ++zaehler;
        this.verantwortlicher = verantwortlicher;
        this.Studienfahrt = fahrt;
    }

    public int getBuchungsNr(){
        return buchungsNr;
    }

    public Lehrer getVerantwortlicher(){
        return verantwortlicher;
    }

    public void setAnzahlSchueler(int anzahlSchueler){
        this.anzahlSchueler = anzahlSchueler;
    }

    public int getAnzahlSchueler(){
        return anzahlSchueler;
    }

    public Studienfahrt getStudienfahrt(){
        return Studienfahrt;
    }
}
