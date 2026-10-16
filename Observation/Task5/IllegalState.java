public class IllegalStateDemo
{
    static boolean loggedIn = false;

    static void openProfile()
    {
        if (!loggedIn)
        {
            throw new IllegalStateException(
                "User must log in first."
            );
        }

        System.out.println("Profile opened.");
    }

    public static void main(String[] args)
    {
        try
        {
            openProfile();
        }
        catch (IllegalStateException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
