package main;

import firma.Firma;
import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;
import mitarbeiter.visitor.PrintVisitor;
import mitarbeiter.visitor.ResetArbeitszeitVisitor;

public class Main {
    public static void main(String[] args) {

        Firma firma = new Firma();

        firma.add(new Lohnempfaenger("Schmitt", 25, 15.6));
        firma.add(new Gehaltsempfaenger("Kunz"));
        firma.add(new Gehaltsempfaenger("Hinz", 2000));

        firma.add(new Lohnempfaenger("Meier", 26, 20));
        firma.add(new Lohnempfaenger("Schulz"));

        //firma.print();
        firma.iterate(new PrintVisitor());
        firma.iterate(new ResetArbeitszeitVisitor());
        firma.iterate(new PrintVisitor());
    }
}