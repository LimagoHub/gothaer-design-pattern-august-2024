package mitarbeiter.visitor;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public interface MitarbeiterVisitor {

    void visit(Gehaltsempfaenger gehaltsempfaenger);
    void visit(Lohnempfaenger lohnempfaenger);
}
