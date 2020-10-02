import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        QuadEquation quadEquation = new QuadEquation();
        double a = quadEquation.inputCoefficient();
        double b = quadEquation.inputCoefficient();
        double c = quadEquation.inputCoefficient();
        quadEquation.setCoef(a, b, c);
        double[] x1x1 = quadEquation.equationCalc();
        String equation = quadEquation.toString();
        System.out.println(equation);
        double discr = b * b - 4 * a * c;
        double x1, x2;
        if (discr < 0) {
            System.out.println("There is no decision");
            x1 = 0;
            x2 = 0;
        } else if (discr == 0) {
            x1 = -(b / 2 * a);
            x2 = x1;
        }
      //  System.out.println("x1 = " + x1);
        //System.out.println("x2 = " + x2);
    }
}
