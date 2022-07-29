package interface1.interface2;

import interface1.Numerable;

public class MyCalculator implements Numerable {

    @Override
    public void devide(double a, double b) {
        double c;
        c = a / b;
        System.out.println(c);
    }

    @Override
    public void minus(double a, double b) {
        double c;
        c = a - b;
        System.out.println(c);
    }

    @Override
    public void multiplay(double a, double b) {
        double c;
        c = a * b;
        System.out.println(c);
    }

    @Override
    public void plus(double a, double b) {
        double c;
        c = a + b;
        System.out.println(c);
    }
}
