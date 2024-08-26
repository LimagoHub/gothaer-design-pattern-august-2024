package main;

import flyweight.AttributedCharachter;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        /*AttributedCharachter ac1 = AttributedCharachter.getAttributedCharachter('A', false);
        AttributedCharachter ac2 = AttributedCharachter.getAttributedCharachter('A', false);
        AttributedCharachter ac3 = AttributedCharachter.getAttributedCharachter('A', true);

        System.out.println(ac1 == ac2);
        System.out.println(ac1 == ac3);
        */


        StringBuilder b = new StringBuilder();
        Instant now = Instant.now();
        for (int i = 0; i < 2_000_000; i++) {
            b.append("a");
        }
        String s = b.toString();

        Instant end = Instant.now();
        Duration duration = Duration.between(now, end);
        System.out.println(duration.toMillis());

    }
}