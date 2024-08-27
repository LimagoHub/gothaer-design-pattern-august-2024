package math;

public class Calculator {

    private static final Calculator instance = new Calculator();


    public static Calculator getInstance() {
        return instance;
    }

    private Calculator(){}

    private double memory = 0.0;

    public double getMemory() {
        return memory;
    }

    // Boese!!!!
    private void setMemory(final double memory) {
        this.memory = memory;
    }


    public void add(double value) {
        memory += value;
    }
    public void sub(double value) {
        memory -= value;
    }
    public void mult(double value) {
        memory *= value;
    }
    public void div(double value) {
        memory /= value;
    }

    public void print() {
        System.out.println(memory);
    }

    public void clear() {
        memory = 0.0;
    }

    public CalculatorMemento getMemento() {
        return new MyCalculatorMemento(memory);
    }

    public void setMemento(final CalculatorMemento memento) {
        MyCalculatorMemento myMemento = (MyCalculatorMemento) memento;
        setMemory(myMemento.getMemory());

    }

    private static class MyCalculatorMemento implements CalculatorMemento {
        private final double memory;

        public MyCalculatorMemento(final double memory) {
            this.memory = memory;
        }

        public double getMemory() {
            return memory;
        }
    }
}
