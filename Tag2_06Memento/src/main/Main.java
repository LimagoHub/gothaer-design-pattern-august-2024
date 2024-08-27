package main;

import tiere.Schwein;
import tiere.SchweinMemento;

public class Main {
    public static void main(String[] args) {

        final Schwein piggy = new Schwein("Miss Piggy");
        System.out.println(piggy);
        SchweinMemento memento = piggy.getMemento();
        piggy.fuettern();
        System.out.println(piggy);
        piggy.setMemento(memento);
        System.out.println(piggy);
    }
}