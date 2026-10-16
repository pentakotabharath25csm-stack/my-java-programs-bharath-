public class NumberFormatDemo
{
    public static void main(String[] args)
    {
        String value = "Java";

        try
        {
            int number = Integer.parseInt(value);
            System.out.println("Number = " + number);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Exception: Invalid number format.");
        }
    }
}
