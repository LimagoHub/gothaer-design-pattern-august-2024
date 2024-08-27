package processors;

public interface CharacterHandler {

    void init();
    void process(char c);
    void dispose();
}
