import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadEquation {
    private double coefA;
    private double coefB;
    private double coefC;
    double x1;
    double x2;

    public QuadEquation() {
    }

    public void setCoef(double coefA, double coefB, double coefC) {
        this.coefA = coefA;
        this.coefB = coefB;
        this.coefC = coefC;
    }

    public double inputCoefficient(int i) {
        double coefficient;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input " + i + " coefficient: ");
            coefficient = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error! This is not correct input!" + e);
            return 1;
        }
       return coefficient;
    }

    public double[] equationCalc() {
        double[] x1x2 = new double[2];
        double discr = coefB * coefB - 4 * coefA * coefC;
        if (discr < 0) {
            System.out.println("There is no decision");
            x1x2[0] = 0;
            x1x2[1] = 0;
        } else if (discr == 0) {
            x1x2[0] = -(coefB / 2 * coefA);
            x1x2[1] = x1x2[0];
        } else {
            x1x2[0] = (-coefB + Math.sqrt(discr)) / (2 * coefA);
            x1x2[1] = (-coefB - Math.sqrt(discr)) / (2 * coefA);
        }
        return x1x2;
    }


    public String outEquation() {
        return null;
    }

    @Override
    public String toString() {
        return "QuadEquation: " + coefA + "x^2 " + coefB + "x " + coefC;
    }
}
