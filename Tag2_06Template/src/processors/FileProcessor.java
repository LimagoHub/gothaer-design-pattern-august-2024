package processors;

import java.io.FileReader;

public abstract class FileProcessor {

    public static final int EOF = -1;

    public final void run(String fileName) {
        try(FileReader reader = new FileReader(fileName)){
            init();
            int c;
            while ((c = reader.read()) != EOF) {
                process((char)c);
            }
            dispose();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected abstract void process(final char c) ;

    protected void init() {
        // ok
    }

    protected void dispose() {
        // ok
    }

}
