package FunctionalInterface;

interface Functional{
    default void display(){
        System.out.println("This is the functional interface");
    }
    int sum(int a,int b);

    public static void show(){
        System.out.println("This is the static method in functional interface");
    }

}
public class Functional_Interface {
    public static void main(String[] args) {
        Functional fn = (a,b)-> a+b;
        fn.display();
        int result = fn.sum(2,4);
        System.out.println("Sum of two numbers: "+ result);
        Functional.show();
    }
}
