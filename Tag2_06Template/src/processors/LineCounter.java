package processors;

public class LineCounter extends FileProcessor{

    private int counter = 0;
    @Override
    protected void process(final char c) {
        if(c == '\n')
            counter ++;
    }

    @Override
    protected void dispose() {
        System.out.println(getClass().getSimpleName() + ": " + counter);
    }
}
