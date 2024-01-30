public class CircleTwo
{
    private double radius;

    public CircleTwo()
    {
        radius = 1.0;
    }

    public CircleTwo(double r)
    {
        if (r <= 0)
        {
            throw new IllegalArgumentException("Invalid radius");
        }
        radius = r;
    }

    @Override
    public String toString()
    {
        return String.format("Circle(radius=%.4f)", getRadius());
    }

    @Override
    public boolean equals(Object obj)
    {
        double radii_diff = Math.abs(getRadius() - ((CircleTwo) obj).getRadius());
        return radii_diff < 0.00005;
    }

    public double getRadius()
    {
        return radius;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double perimeter()
    {
        return Math.PI * 2 * radius;
    }
}
