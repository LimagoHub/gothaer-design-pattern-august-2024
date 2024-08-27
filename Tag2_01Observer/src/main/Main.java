package main;

import tiere.PigTooFatListener;
import tiere.Schwein;

import java.util.Observer;

public class Main {

    private final Metzger metzger = new Metzger();
    private final Spediteur spediteur = new Spediteur();
    public static void main(String[] args) {
       new Main().run();
    }

    private void run() {
        Schwein piggy = new Schwein("Miss Piggy");
        piggy.addPigTooFatLister(new SchweineMetzgerAdapter());
        piggy.addPigTooFatLister(s->spediteur.fahren(s));
        piggy.addPigTooFatLister(spediteur::fahren);
        for (int i = 0; i < 11; i++) {
            piggy.fuettern();
        }
    }

    class SchweineMetzgerAdapter implements PigTooFatListener {
        @Override
        public void pigTooFat(final Schwein sender) {
            metzger.schlachten(sender);
        }
    }
}

class Metzger {


    public void schlachten(final Object tier) {
        System.out.println("Messer wetz");
    }
}

class Spediteur {
    public void fahren(final Object ware) {
        System.out.println("Wir fahren auf der Autobahn");
    }
}

