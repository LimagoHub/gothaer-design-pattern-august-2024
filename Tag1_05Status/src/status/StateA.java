package status;

public class StateA extends AbstractState{
    public StateA(final Front front) {
        super(front);
    }

    @Override
    public void changeToB() {
        getFront().current = getFront().stateB;
    }

    @Override
    public void print() {
        System.out.println("Hier druckt State A");
    }
}
