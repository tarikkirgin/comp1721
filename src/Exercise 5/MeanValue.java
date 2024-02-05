public class MeanValue
{
    public static double meanValue(double[] data)
    {
        double total = 0;
        for (double element : data)
        {
            total += element;
        }
        return total / data.length;
    }

    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.err.println("Usage: java MeanValue <values...>");
            System.exit(1);
        }
        double[] data = new double[args.length];
        for (int i = 0; i < data.length; i++)
        {
            data[i] = Double.parseDouble(args[i]);
        }
        double mean = meanValue(data);
        System.out.printf("Mean value = %.3f\n", mean);
    }
}
