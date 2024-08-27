package command;

import math.Calculator;

public class PrintCommand extends AbstractCommand{
    @Override
    public void execute() {
        Calculator.getInstance().print();
    }
}
