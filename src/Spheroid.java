import java.util.Scanner;

public class Spheroid
{
    public static void main()
    {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter equatorial radius in km: ");
        double equatorial_radius = stdin.nextDouble();
        System.out.print("Enter polar radius in km: ");
        double polar_radius = stdin.nextDouble();
        double eccentricity = Math.sqrt(1 - ((polar_radius * polar_radius) / (equatorial_radius * equatorial_radius)));
        double volume = (4 * Math.PI * equatorial_radius * equatorial_radius * polar_radius) / 3;
        System.out.printf("Eccentricity = %.3f\n", eccentricity);
        System.out.printf("Volume = %g cubic km\n", volume);
    }
}
