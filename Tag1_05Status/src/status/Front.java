package status;

public class Front {

    /* package */ final State stateA = new StateA(this);
    /* package */ final State stateB = new StateB(this);
    /* package */ State current = stateA;

    public void print() {
        current.print();
    }

    public void changeToA() {
        current.changeToA();
    }

    public void changeToB() {
        current.changeToB();
    }
}
