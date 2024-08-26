package mitarbeiter;

import mitarbeiter.visitor.MitarbeiterVisitor;

public class Gehaltsempfaenger extends AbstractMitarbeiter{

    private double gehalt = 1000;
    public Gehaltsempfaenger(final String name) {
        super(name);
    }

    public Gehaltsempfaenger(final String name, final double gehalt) {
        super(name);
        this.gehalt = gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(final double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {

        return super.toString() + ", gehalt=" + gehalt;
    }

    public  void accept(final MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
