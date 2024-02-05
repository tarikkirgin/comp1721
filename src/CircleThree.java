import java.io.IOException;
import java.io.Writer;

public class CircleThree implements Writeable
{
    private double radius;

    public CircleThree(double r)
    {
        radius = r;
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

    public void writeTo(Writer destination) throws IOException
    {
        destination.write(String.format("Circle: r=%.4f\n", getRadius()));
    }
}
