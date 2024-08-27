package command;

import math.Calculator;


public class ClearCommand extends AbstractCommand {
    private double oldValue;

    @Override
    public void execute() {
        oldValue = Calculator.getInstance().getMemory();
        Calculator.getInstance().clear();
    }

    @Override
    public void undo() {
        Calculator.getInstance().setMemory(oldValue);
    }

    @Override
    public boolean isQuery() {
        return false;
    }
}
