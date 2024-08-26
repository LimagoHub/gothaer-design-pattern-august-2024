package mitarbeiter.visitor;

import mitarbeiter.Lohnempfaenger;

public class ResetArbeitszeitVisitor extends AbstractMitarbeiterVisitor{
    @Override
    public void visit(final Lohnempfaenger lohnempfaenger) {
       lohnempfaenger.setArbeitszeit(0);
    }
}
