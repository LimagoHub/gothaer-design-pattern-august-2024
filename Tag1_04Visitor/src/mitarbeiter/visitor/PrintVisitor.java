package mitarbeiter.visitor;

import mitarbeiter.AbstractMitarbeiter;
import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public class PrintVisitor implements MitarbeiterVisitor{
    @Override
    public void visit(final Gehaltsempfaenger gehaltsempfaenger) {
        print(gehaltsempfaenger);
    }

    @Override
    public void visit(final Lohnempfaenger lohnempfaenger) {
        print(lohnempfaenger);
    }

    private void print(AbstractMitarbeiter mitarbeiter) {
        System.out.println(mitarbeiter);
    }
}
