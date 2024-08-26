package firma;

import mitarbeiter.AbstractMitarbeiter;
import mitarbeiter.Lohnempfaenger;
import mitarbeiter.visitor.MitarbeiterVisitor;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    private final List<AbstractMitarbeiter> mitarbeiters = new ArrayList<AbstractMitarbeiter>();

    public void add(final AbstractMitarbeiter abstractMitarbeiter) {
        mitarbeiters.add(abstractMitarbeiter);
    }

    public void remove(final AbstractMitarbeiter abstractMitarbeiter) {
        mitarbeiters.remove(abstractMitarbeiter);
    }

    public void print() {
        mitarbeiters.forEach(System.out::println);
    }

    public void iterate(MitarbeiterVisitor visitor) {
        for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {

               // visitor.visit(mitarbeiter);
                mitarbeiter.accept(visitor);

        }
    }
}
