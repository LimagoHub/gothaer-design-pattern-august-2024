package processors;

import java.io.FileWriter;
import java.io.IOException;

public class FileCopy extends FileProcessor {

    private FileWriter writer;

    @Override
    protected void init() {
        try {
            writer = new FileWriter("./resources/ausgabe.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void process(final char c) {
        try {
            writer.write(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void dispose() {
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
