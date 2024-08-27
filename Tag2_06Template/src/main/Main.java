package main;

import processors.CharacterCounter;
import processors.FileCopy;
import processors.FileProcessor;
import processors.LineCounter;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        FileProcessor fileProcessor = new FileCopy();
        fileProcessor.run("./resources/eingabe.txt");
    }
}