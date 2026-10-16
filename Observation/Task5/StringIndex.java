public class StringIndexDemo
{
    public static void main(String[] args)
    {
        String text = "JAVA";

        try
        {
            System.out.println(text.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Exception: Invalid String index.");
        }
    }
}
