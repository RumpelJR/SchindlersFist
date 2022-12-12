public class Studienfahrt{
    private String reiseziel;
    private int anzahlTage;
    private double preisProPerson;

    public Studienfahrt(String ziel, int tage, double preis){
        reiseziel = ziel;
        anzahlTage = tage;
        preisProPerson = preis;
    }

    public double getPreisProPerson(){
        return preisProPerson;
    }

    public String getReiseDaten(){
        return reiseziel +", " +anzahlTage +" Tage, " +preisProPerson +" Euro p.P.";
    }
}