package interface1.interface2;

public class Application {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();

        System.out.print("12.5 + 44.2 = ");
        myCalculator.plus(12.5, 44.2);

        System.out.print("76.3 - 213.51 = ");
        myCalculator.minus(76.3, 213.51);

        System.out.print("12 * 14.9 = ");
        myCalculator.multiplay(12, 14.9);

        System.out.print("44 / 11 = ");
        myCalculator.devide(44, 11);
    }
}
