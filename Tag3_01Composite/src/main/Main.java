package main;

import composite.AbstractNode;
import composite.Leaf;
import composite.Node;

public class Main {
    public static void main(String[] args) {

        Node root = new Node("root");

        Node ebene_1_1 = new Node("ebene_1_1");
        root.appendChild(ebene_1_1);

        Node ebene_1_2 = new Node("ebene_1_2");
        root.appendChild(ebene_1_2);

        Node ebene_2_1_1 = new Node("ebene_2_1_1");
        ebene_1_1.appendChild(ebene_2_1_1);

        Node ebene_2_1_2 = new Node("ebene_2_1_2");
        ebene_1_1.appendChild(ebene_2_1_2);

        Node ebene_2_2_1 = new Node("ebene_2_2_1");
        ebene_1_2.appendChild(ebene_2_2_1);

        Node ebene_2_2_2 = new Node("ebene_2_2_2");
        ebene_1_2.appendChild(ebene_2_2_2);

        Leaf eins = new Leaf("eins");
        ebene_1_1.appendChild(eins);

        Leaf zwei = new Leaf("zwei");
        ebene_2_1_1.appendChild(zwei);

        traverse(root);
    }

    static void traverse(AbstractNode node) {
        System.out.println(node);
        for (AbstractNode child : node.getChildren()) {
            traverse(child);
        }
    }
}