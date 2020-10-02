import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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

    public double inputCoefficient() throws IOException {
        double coefficient;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input coefficient: ");
        coefficient = scanner.nextDouble();
        System.out.println();
        return coefficient;
    }

    public double[] equationCalc(){
        double[]x1x2 = new double[2];
        double discr = coefB * coefB - 4 * coefA * coefC;
        x1 = (-coefB + Math.sqrt(discr)) / (2 * coefA);
        x2 = (-coefB - Math.sqrt(discr)) / (2 * coefA);
        return x1x2;
    }


    public String outEquation (){
        return null;
    }

    @Override
    public String toString() {
        return "QuadEquation: " + coefA + "x^2 " + coefB + "x " + coefC;
    }
}
