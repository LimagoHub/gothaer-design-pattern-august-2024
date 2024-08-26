package mitarbeiter.visitor;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public class StatistikVisitor implements MitarbeiterVisitor {

    private int lohnempfaengerAnzahl;
    private int gehaltsempfaengerAnzahl;


    public int getLohnempfaengerAnzahl() {
        return lohnempfaengerAnzahl;
    }

    public int getGehaltsempfaengerAnzahl() {
        return gehaltsempfaengerAnzahl;
    }

    public int getGesamtAnzahl() {
        return lohnempfaengerAnzahl + gehaltsempfaengerAnzahl;
    }

    @Override
    public void init() {
        lohnempfaengerAnzahl = gehaltsempfaengerAnzahl = 0;
    }

    @Override
    public void dispose() {
        System.out.println(this);
    }

    @Override
    public void visit(final Gehaltsempfaenger gehaltsempfaenger) {
     gehaltsempfaengerAnzahl ++;
    }

    @Override
    public void visit(final Lohnempfaenger lohnempfaenger) {
        lohnempfaengerAnzahl ++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatistikVisitor{");
        sb.append("lohnempfaengerAnzahl=").append(lohnempfaengerAnzahl);
        sb.append(", gehaltsempfaengerAnzahl=").append(gehaltsempfaengerAnzahl);
        sb.append(", gesamtAnzahl=").append(getGesamtAnzahl());
        sb.append('}');
        return sb.toString();
    }
}
