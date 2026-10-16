public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private double price;
  
    public Book() {
        this.bookId = 0;
        this.bookName = "Not Assigned";
        this.author = "Not Assigned";
        this.price = 0.0;
    }

    public Book(int bookId, String bookName, String author, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }

    public String getBookName() { return bookName; }
    public void setBookName(String bookName) { this.bookName = bookName; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void displayBook() {
        System.out.println("Book ID: " + bookId + " | Name: " + bookName + 
                           " | Author: " + author + " | Price: $" + price);
    }
}

class Person {
    String name;
    public Person(String name) { this.name = name; }
    void displayPerson() { System.out.println("Name: " + name); }
}

class Student extends Person {
    int roll;
    public Student(String name, int roll) { 
        super(name); 
        this.roll = roll; 
    }
    void displayStudent() { 
        displayPerson(); 
        System.out.println("Roll Number: " + roll); 
    }
}

class Faculty extends Person {
    String department;
    public Faculty(String name, String department) { 
        super(name); 
        this.department = department; 
    }
    void displayFaculty() { 
        displayPerson(); 
        System.out.println("Department: " + department); 
    }
}

class AreaCalculator {
    
    public double area(double radius) { 
        return Math.PI * radius * radius; 
    }
    public double area(double length, double breadth) { 
        return length * breadth; 
    }
}

class Vehicle {
    void display() { System.out.println("This is a generic Vehicle."); }
}

class Car extends Vehicle {
    
    @Override
    void display() { System.out.println("This is a Car."); }
}

class Bike extends Vehicle {
    // Method Overriding
    @Override
    void display() { System.out.println("This is a Bike."); }
}

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing a Circle."); }
}

class Rectangle extends Shape {
    void draw() { System.out.println("Drawing a Rectangle."); }
}

interface Printable {
    void print();
}

class Report implements Printable {
    public void print() { System.out.println("Printing the Report..."); }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println("===== OOP Concepts Demonstration =====");
      
        System.out.println("\n[Part A & B] Encapsulation & Constructors:");
        Book b1 = new Book(); 
 
        Book b2 = new Book(101, "Head First Java", "Kathy Sierra", 45.50);
        b1.displayBook();
        b2.displayBook();

        System.out.println("\n[Part C] Inheritance:");
        Student student = new Student("Alice", 10);
        student.displayStudent();
        
        Faculty faculty = new Faculty("Dr. Bob", "Computer Science");
        faculty.displayFaculty();
        
        System.out.println("\n[Part D] Polymorphism:");
        AreaCalculator calc = new AreaCalculator();
        System.out.println("Area of circle (r=5.0): " + calc.area(5.0));
        System.out.println("Area of rectangle (l=4, b=6): " + calc.area(4.0, 6.0));
        
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.display(); 
        v2.display();
      
        System.out.println("\n[Part E] Abstraction & Interfaces:");
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        shape1.draw();
        shape2.draw();
        
        Printable document = new Report();
        document.print();
    }
}
