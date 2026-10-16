class Animal
{
}

class Dog extends Animal
{
}

class ClassCastDemo
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();

        try
        {
            Dog dog = (Dog) animal;
            System.out.println("Casting successful.");
        }
        catch (ClassCastException e)
        {
            System.out.println("Exception: Invalid type casting.");
        }
    }
}
