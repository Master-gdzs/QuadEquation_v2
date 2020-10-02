import java.io.IOException;

public class main {
    public static void main(String[] args) {
        QuadEquation quadEquation = new QuadEquation();
        double a = quadEquation.inputCoefficient();
        double b = quadEquation.inputCoefficient();
        double c = quadEquation.inputCoefficient();
        quadEquation.setCoef(a, b, c);
        double[] x1x2 = quadEquation.equationCalc();
        String equation = quadEquation.toString();
        System.out.println(equation);
        System.out.println("x1 = " + x1x2[0]);
        System.out.println("x2 = " + x1x2[1]);
    }
}
