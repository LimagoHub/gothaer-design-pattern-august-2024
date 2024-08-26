package math;

public class CalculatorImpl implements Calculator {

    /* package */ CalculatorImpl() {
    }

    @Override
    public double add(double a, double b) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return add(a, -b);
    }
}
