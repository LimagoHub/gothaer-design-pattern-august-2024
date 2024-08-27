package processors;

public class LineCounter extends AbstractCounterHandler{


    @Override
    public void process(final char c) {
        if(c == '\n')
            incrementCounter();
    }





}
