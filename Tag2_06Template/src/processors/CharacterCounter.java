package processors;

public class CharacterCounter extends AbstractCounterHandler{



    @Override
    public void process(final char c) {
        incrementCounter();
    }



}
