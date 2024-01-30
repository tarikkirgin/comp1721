import java.util.Scanner;

public class Weight {
    public static void main() {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight_kg = stdin.nextDouble();
        double weight_lb = weight_kg * 2.205;
        int lb = ((int) weight_lb);
        double oz = (weight_lb - lb) * 16;
        System.out.printf("Equivalent imperial weight is %d lb %.1f oz\n", lb, oz);
    }
}
