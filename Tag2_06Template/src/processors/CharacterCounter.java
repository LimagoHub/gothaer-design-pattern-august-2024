package processors;

public class CharacterCounter extends FileProcessor{

    private int counter = 0;
    @Override
    protected void process(final char c) {
        counter ++;
    }

    @Override
    protected void dispose() {
        System.out.println(getClass().getSimpleName() + ": " + counter);
    }
}
