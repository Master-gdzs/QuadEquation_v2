import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coef A");
        int a = scanner.nextInt();
        System.out.println("Enter coef B");
        int b = scanner.nextInt();
        System.out.println("Enter coef C");
        int c = scanner.nextInt();
        double discr = b * b - 4 * a * c;
        double x1, x2;
        if (discr < 0) {
            System.out.println("There is no decision");
            x1 = 0;
            x2 = 0;
        } else if (discr == 0) {
            x1 = -(b / 2 * a);
            x2 = x1;
        } else {
            x1 = (-b + Math.sqrt(discr) )/ (2 * a);
            x2 = (-b - Math.sqrt(discr) )/ (2 * a);
        }
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
