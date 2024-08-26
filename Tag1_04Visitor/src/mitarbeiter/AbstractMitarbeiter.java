package mitarbeiter;

import mitarbeiter.visitor.MitarbeiterVisitor;

public abstract class AbstractMitarbeiter {

    private String name;

    public AbstractMitarbeiter(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("name='").append(name).append("' ");

        return sb.toString();
    }

    public abstract void accept(final MitarbeiterVisitor visitor);
}
