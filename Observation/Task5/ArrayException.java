public class ArrayExceptionDemo
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50};

        try
        {
            System.out.println("Value = " + numbers[8]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception: Array index is out of bounds.");
        }
    }
}
