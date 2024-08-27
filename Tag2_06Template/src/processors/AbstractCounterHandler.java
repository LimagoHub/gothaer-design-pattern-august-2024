package processors;

public abstract class AbstractCounterHandler extends AbstractCharacterHandler{

    private int counter;

    protected int getCounter() {
        return counter;
    }

    public void incrementCounter() {
        counter ++;
    }

    @Override
    public void init() {
        counter = 0;
    }

    @Override
    public void dispose() {
        System.out.printf("%s: Anzahl = %s\n", getClass().getSimpleName(), getCounter());
    }
}
