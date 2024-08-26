package mitarbeiter.visitor;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor {
    @Override
    public void visit(final Gehaltsempfaenger gehaltsempfaenger) {
        // Ok
    }

    @Override
    public void visit(final Lohnempfaenger lohnempfaenger) {
        // Ok
    }

    @Override
    public void init() {
        // ok
    }

    @Override
    public void dispose() {
        // ok
    }
}
