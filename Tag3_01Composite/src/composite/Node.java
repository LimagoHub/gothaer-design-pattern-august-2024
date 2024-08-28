package composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node extends AbstractNode {

    private final List<AbstractNode> children = new ArrayList<>();

    public Node(final String label) {
        super(label);
    }

    @Override
    public List<AbstractNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void appendChild(final AbstractNode child) {
        if(child == this) throw new IllegalArgumentException("Upps");
        child.setParent(this);
        children.add(child);

    }

    public void removeChild(final AbstractNode child) {
        child.setParent(null);
        children.remove(child);

    }
}
