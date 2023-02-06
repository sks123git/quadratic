import java.util.Scanner;
//Program to find quadratic roots
public class Quadratic {
    public static void main(String[] args) {
        double a,b,c;
        double delta,sqrt;
        double root1 = 0;
        double root2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = scanner.nextDouble();
        System.out.println("Enter the value of b");
        b = scanner.nextDouble();
        System.out.println("Enter the value of c");
        c = scanner.nextDouble();

        delta = Math.pow(b,2) - 4 * a * c;
        sqrt = Math.sqrt(delta);

        root1 = (-b + sqrt)/(2 * a);
        root2 = (-b - sqrt)/(2 * a);

        System.out.println("Root 1 of x: "+ root1 );
        System.out.println("Root 2 of x: "+ root2 );
    }
}