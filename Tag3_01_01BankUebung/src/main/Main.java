package main;

import composite.AbstractKontoNode;
import composite.Konto;
import composite.KontoGruppe;

public class Main {
    public static void main(String[] args) {

        KontoGruppe root = new KontoGruppe("root");

        KontoGruppe ebene_1_1 = new KontoGruppe("ebene_1_1");
        root.appendChild(ebene_1_1);

        KontoGruppe ebene_1_2 = new KontoGruppe("ebene_1_2");
        root.appendChild(ebene_1_2);

        KontoGruppe ebene_2_1_1 = new KontoGruppe("ebene_2_1_1");
        ebene_1_1.appendChild(ebene_2_1_1);

        KontoGruppe ebene_2_1_2 = new KontoGruppe("ebene_2_1_2");
        ebene_1_1.appendChild(ebene_2_1_2);

        KontoGruppe ebene_2_2_1 = new KontoGruppe("ebene_2_2_1");
        ebene_1_2.appendChild(ebene_2_2_1);

        KontoGruppe ebene_2_2_2 = new KontoGruppe("ebene_2_2_2");
        ebene_1_2.appendChild(ebene_2_2_2);

        Konto eins = new Konto("eins");
        ebene_1_1.appendChild(eins);

        Konto zwei = new Konto("zwei");
        ebene_2_1_1.appendChild(zwei);

        root.print();

        for(var item: root) {
            System.out.println(item);
        }
    }

    static void traverse(AbstractKontoNode node) {
        System.out.println(node);
        for (AbstractKontoNode child : node.getChildren()) {
            traverse(child);
        }
    }
}