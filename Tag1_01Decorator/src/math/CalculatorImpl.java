package math;


// run as Admin
public class CalculatorImpl implements Calculator {

    /* package */ CalculatorImpl() {
    }


    // Role Admin
    @Override
    public double add(double a, double b) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a + b;
    }


    // Role Gast
    @Override
    public double sub(double a, double b) {
        return this.add(a, -b);
    }
}
