package tiere;

import events.PropertyChangedEvent;
import events.PropertyChangedListener;

import java.util.ArrayList;
import java.util.List;

public class Schwein {

    public static final int MAX_WEIGHT = 20;
    private final List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
    private final List<PropertyChangedListener> propertyChangedListeners = new ArrayList<>();
    public void addPigTooFatLister(final PigTooFatListener listener) {
        pigTooFatListeners.add(listener);
    }

    public void removePigTooFatLister(final PigTooFatListener listener) {
        pigTooFatListeners.remove(listener);
    }

    public void addPropertyChangedListener(final PropertyChangedListener listener) {
        propertyChangedListeners.add(listener);
    }
    public void removePropertyChangedListener(final PropertyChangedListener listener) {
        propertyChangedListeners.remove(listener);
    }

    private void firePigTooFatEvent() {
        pigTooFatListeners.forEach(ptfl->ptfl.pigTooFat(this));
    }

    private void firePropertyChangedEvent(PropertyChangedEvent event) {
        propertyChangedListeners.forEach(el->el.propertyChanged(event));
    }

    private void firePropertyChangedEvent(String propertyName, Object oldValue, Object newValue) {
        firePropertyChangedEvent(new PropertyChangedEvent(this, propertyName, oldValue, newValue));
    }

    private String name;
    private int gewicht;

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
        if (this.name != name) {
            final var propertyChangedEvent = new PropertyChangedEvent(this, "name", this.name, name);
            this.name = name;
            firePropertyChangedEvent(propertyChangedEvent);
        }
        //firePropertyChangedEvent("name", this.name, this.name=name);
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        firePropertyChangedEvent("gewicht", this.gewicht, this.gewicht=gewicht);
        if(gewicht > MAX_WEIGHT) firePigTooFatEvent();
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
}
