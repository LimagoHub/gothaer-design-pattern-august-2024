package composite.visitor;

import composite.Konto;
import composite.KontoGruppe;

public interface KontenVisitor {

    void init();
    void visit(Konto konto);
    void visit(KontoGruppe kontoGruppe);
    void dispose();

}
