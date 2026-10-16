public class ClassNotFoundDemo
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("UnknownClass");
            System.out.println("Class found.");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Exception: Class not found.");
        }
    }
}
