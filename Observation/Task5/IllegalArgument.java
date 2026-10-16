public class IllegalArgumentDemo
{
    static void checkAge(int age)
    {
        if (age < 0)
        {
            throw new IllegalArgumentException("Age cannot be negative.");
        }

        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args)
    {
        try
        {
            checkAge(-5);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
