package mitarbeiter;

import mitarbeiter.visitor.MitarbeiterVisitor;

public class Lohnempfaenger extends AbstractMitarbeiter{

    private double arbeitszeit =36;
    private double stundenlohn=20.5;
    public Lohnempfaenger(final String name) {
        super(name);
    }

    public Lohnempfaenger(final String name, final double arbeitszeit, final double stundenlohn) {
        super(name);
        this.arbeitszeit = arbeitszeit;
        this.stundenlohn = stundenlohn;
    }

    public double getArbeitszeit() {
        return arbeitszeit;
    }

    public void setArbeitszeit(final double arbeitszeit) {
        this.arbeitszeit = arbeitszeit;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(final double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    @Override
    public String toString() {
        return super.toString() + ", Stundenlohn: " + stundenlohn + ", Arbeitszeit: " + arbeitszeit;
    }

    public  void accept(final MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
