public class CircleDemoTwo
{
    public static void main(String[] args)
    {
        CircleTwo circle = new CircleTwo(

        );
        CircleTwo circle2_electric_boogaloo = new CircleTwo(1.0000001);
        // below implicitly calls toString() on the object! (neat)
        System.out.println(circle2_electric_boogaloo);
        System.out.printf("Two circles are equal: %b\n", circle.equals(circle2_electric_boogaloo));
        System.out.printf("""
                Radius = %.3f
                Perimeter = %.3f
                Area = %.3f
                """, circle.getRadius(), circle.perimeter(), circle.area());
    }
}
