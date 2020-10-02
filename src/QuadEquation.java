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

    @Override
    public String toString() {
        return "QuadEquation: " + coefA + "x^2 " + coefB + "x " + coefC;
    }
}
