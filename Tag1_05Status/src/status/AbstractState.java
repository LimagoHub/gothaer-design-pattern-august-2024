package status;

public abstract class AbstractState implements State {

    private final Front front;

    protected AbstractState(final Front front) {
        this.front = front;
    }

    protected final Front getFront() {
        return front;
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Diese Operation macht in diesem Zustand keinnen Sinn!");
    }

    @Override
    public void changeToA() {
        throw new UnsupportedOperationException("Diese Operation macht in diesem Zustand keinnen Sinn!");
    }

    @Override
    public void changeToB() {
        throw new UnsupportedOperationException("Diese Operation macht in diesem Zustand keinnen Sinn!");
    }
}
