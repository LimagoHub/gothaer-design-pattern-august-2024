package command;

import math.Calculator;
import math.CalculatorMemento;

public class MultCommand implements Command {

    private CalculatorMemento memento;
    private double value;
    @Override
    public void parse(final String[] tokens) {
        value = Double.parseDouble(tokens[1]);
    }

    @Override
    public void execute() {
        memento =  Calculator.getInstance().getMemento();
        Calculator.getInstance().mult(value);
    }

    @Override
    public void undo() {
        Calculator.getInstance().setMemento(memento);
    }

    @Override
    public boolean isQuery() {
        return false;
    }
}
