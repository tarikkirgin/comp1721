public class CircleDemo
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(4.5);
        System.out.printf("""
                Radius = %.3f
                Perimeter = %.3f
                Area = %.3f
                """, circle.getRadius(), circle.perimeter(), circle.area());
    }
}
