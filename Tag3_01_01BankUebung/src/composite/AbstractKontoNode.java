package composite;

import composite.visitor.AbstractKontoVisitor;
import composite.visitor.KontenVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractKontoNode implements Iterable<AbstractKontoNode> {


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
       this.iterator().forEachRemaining(System.out::println);
    }

    @Override
    public Iterator<AbstractKontoNode> iterator() {
        final List<AbstractKontoNode> items = new ArrayList<AbstractKontoNode>();
        fillIteratorList(items);
        return items.iterator();
    }

    private void fillIteratorList(final List<AbstractKontoNode> list) {
        list.add(this);
        for (final AbstractKontoNode child : getChildren()) {
            child.fillIteratorList(list);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append(": label='").append(label).append('\'');

        return sb.toString();
    }

    public void iterate(KontenVisitor visitor) {
        visitor.init();
        iterator().forEachRemaining(item->item.accept(visitor));
        visitor.dispose();
    }

    public abstract void accept(KontenVisitor visitor);
}
