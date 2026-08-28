class f{           // create a class 
    int a =10;
    void sum(){
        System.out.println("sum is " + (a+34)); 
in class f have initialise variable and one method 
    }
}
// create another class 
// class f is inherited by class S to using of keyword " extends"
/* here class f is super class
and class S is sub class*/
class s extends f{
    int b = 54;
   // f add  = new f();
    void sub(){
        System.out.println( " subtraction is " + (b-10) );
    }

}
public class Inherit1 {    // main method 
    public static void main(String[] args) {
// create an object for sub class 
        s oc = new s();
// print and call super class variable 
        System.out.println(" variable can access is" + (oc.a) );
// print the sub class variable 
        System.out.println(" variable can access" + (oc.b));
// call super class methods from sub class object 
        oc.sum();
        oc.sub();
        
    }
}
