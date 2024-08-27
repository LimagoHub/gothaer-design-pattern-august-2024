package tiere;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Schwein  {

    private String name;
    private int gewicht;

   //private List<Schwein> ferkel = new ArrayList<>();

    public Schwein() {
        this("nobody");
    }

    public Schwein(final String name) {
        this.name = name;
        this.gewicht = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        this.gewicht = gewicht;
    }

    public void fuettern() {
        setGewicht(getGewicht() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }

    public SchweinMemento getMemento() {
        return new MySchweinMemento(name, gewicht);
    }

    public void setMemento(final SchweinMemento memento) {
        MySchweinMemento myMemento = (MySchweinMemento) memento;
        setGewicht(myMemento.getGewicht());
        setName(myMemento.getName());
    }

    private static class MySchweinMemento implements SchweinMemento {
        private final String name;
        private final int gewicht;

        public MySchweinMemento(final String name, final int gewicht) {
            this.name = name;
            this.gewicht = gewicht;
        }

        public String getName() {
            return name;
        }

        public int getGewicht() {
            return gewicht;
        }
    }
}
