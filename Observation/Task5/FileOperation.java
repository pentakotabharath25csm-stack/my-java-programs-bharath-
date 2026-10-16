import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileExceptionDemo
{
    public static void main(String[] args)
    {
        try
        {
            FileReader file = new FileReader("missing.txt");
            System.out.println("File opened successfully.");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Exception: File not found.");
        }
    }
}
