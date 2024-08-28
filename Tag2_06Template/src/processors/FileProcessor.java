package processors;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/*
    https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm

 */
public class FileProcessor {

    public static final int EOF = -1;

    private final List<CharacterHandler> handlers;


    public FileProcessor() {
        handlers = new ArrayList<CharacterHandler>();
    }

    public FileProcessor(final List<CharacterHandler> handlers) {
        this.handlers = new ArrayList<>(handlers);
    }

    public void addCharacterHandler(final CharacterHandler handler) {
        handlers.add(handler);
    }

    public void removeCharacterHandler(final CharacterHandler handler) {
        handlers.remove(handler);
    }


    public final void run(String fileName) {
        try(FileReader reader = new FileReader(fileName)){
            init();
            int c;
            while ((c = reader.read()) != EOF) {
                process((char)c);
            }
            dispose();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void process(final char c) {
        handlers.forEach(handler -> handler.process(c));
    }

    private void init() {
        handlers.forEach(CharacterHandler::init);
    }

    private void dispose() {
        handlers.forEach(CharacterHandler::dispose);
    }

}
