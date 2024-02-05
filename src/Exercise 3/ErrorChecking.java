import java.util.Scanner;

public class ErrorChecking
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter equatorial radius in km: ");
        double equatorial_radius = stdin.nextDouble();
        if (equatorial_radius <= 0)
        {
            System.out.println("Error: equatorial radius must be larger than 0");
            System.exit(1);
        }
        System.out.print("Enter polar radius in km: ");
        double polar_radius = stdin.nextDouble();
        if (polar_radius <= 0)
        {
            System.out.println("Error: polar radius must be larger than 0");
            System.exit(1);
        }
        if (polar_radius > equatorial_radius)
        {
            System.out.println("Error: equatorial radius must be larger than polar radius");
            System.exit(1);
        }
        double eccentricity = Math.sqrt(1 - ((polar_radius * polar_radius) / (equatorial_radius * equatorial_radius)));
        double volume = (4 * Math.PI * equatorial_radius * equatorial_radius * polar_radius) / 3;
        System.out.printf("Eccentricity = %.3f\n", eccentricity);
        System.out.printf("Volume = %g cubic km\n", volume);
    }
}
