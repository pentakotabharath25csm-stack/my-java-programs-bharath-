import java.io.IOException;

public class IOExceptionDemo
{
    static void readData() throws IOException
    {
        throw new IOException("Error while reading data.");
    }

    public static void main(String[] args)
    {
        try
        {
            readData();
        }
        catch (IOException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
