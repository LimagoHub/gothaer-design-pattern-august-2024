package composite.visitor;

import composite.Konto;
import composite.KontoGruppe;

public abstract class AbstractKontoVisitor implements KontenVisitor{
    @Override
    public void init() {
        // ok
    }

    @Override
    public void visit(final Konto konto) {
        // ok
    }

    @Override
    public void visit(final KontoGruppe kontoGruppe) {
        // ok
    }

    @Override
    public void dispose() {
        // ok
    }
}
