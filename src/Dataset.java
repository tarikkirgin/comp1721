import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dataset
{
    private ArrayList<Double> data;


    public Dataset(String filename) throws IOException
    {
        File file = new File(filename);
        Scanner fileReader = new Scanner(file);
        while (fileReader.hasNextDouble())
        {
            data.add(fileReader.nextDouble());
        }
    }

    public int size()
    {
        return data.size();
    }

    public double meanValue()
    {
        int arraySize = size();
        if (arraySize == 0)
        {
            throw new ArithmeticException("No values in data array.");
        }
        double sum = 0;
        for (double num : data)
        {
            sum += num;
        }
        return sum / arraySize;
    }
}
