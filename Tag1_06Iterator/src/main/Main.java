package main;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var liste = List.of("Eins","zwei","drei","drei","drei");

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

        System.out.println("-----------------");

        for(var item: liste) {
            System.out.println(item);
        }

        System.out.println("-----------------");
        liste.forEach(System.out::println);

        System.out.println("-----------------");

        Iterator<String> it = liste.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());

        }
        System.out.println("-----------------");
        Iterator<String> itNeu = liste.iterator();
        itNeu.forEachRemaining(System.out::println);

        /*
                Person [] persons = getAllCustomers();
                List<Person> persons = getAllCustomers();
                Iterator<Person> it = getAllCustomers();

         */

    }
}