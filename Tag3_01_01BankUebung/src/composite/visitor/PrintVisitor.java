package composite.visitor;

import composite.Konto;
import composite.KontoGruppe;

public class PrintVisitor extends AbstractKontoVisitor{
    @Override
    public void visit(final Konto konto) {
        System.out.println(konto);
    }

    @Override
    public void visit(final KontoGruppe kontoGruppe) {
        System.out.println();
    }
}
