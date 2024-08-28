package composite;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AbstractKontoNode implements Iterable<AbstractKontoNode> {


    private AbstractKontoNode parent = null;
    private String label;

    protected AbstractKontoNode(final String label) {
        this.label = label;
    }

    public AbstractKontoNode getParent() {
        return parent;
    }

    public void setParent(final AbstractKontoNode parent) {
        this.parent = parent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public List<AbstractKontoNode> getChildren() {
        return Collections.emptyList();
    }

    public void print() {
        /*System.out.println(this);

        for (final AbstractKontoNode child : getChildren()) {
            child.print();
        }*/
        this.iterator().forEachRemaining(System.out::println);
    }

    @Override
    public Iterator<AbstractKontoNode> iterator() {
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append(": label='").append(label).append('\'');

        return sb.toString();
    }
}
