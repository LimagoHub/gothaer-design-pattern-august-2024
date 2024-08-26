package status;

public class StateB extends AbstractState{
    public StateB(final Front front) {
        super(front);
    }

    @Override
    public void print() {
        System.out.println("Hier druckt State B");
    }

    @Override
    public void changeToA() {
        getFront().current = getFront().stateA;
    }
}
