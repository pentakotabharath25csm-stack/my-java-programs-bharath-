public class Medhod2 {
    int rollNo;
String name;

// constructor
public Medhod2() {
this.rollNo = 245;
this.name = "Bharath";
System.out.println("Variables are ready");
}

void showDetails() {
System.out.println("My rollNo is: " + rollNo);
System.out.println("My name is: " + name);
}

public static void main(String[] args) {
Medhod2 cd = new Medhod2(); //constr call
cd.showDetails();
}
}

