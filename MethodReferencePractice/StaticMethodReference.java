package MethodReferencePractice;

interface Addition{
    default void show(){
        System.out.println("Performing the add operation: ");
    }
    int sum(int a,int b);
    static void display(){
        System.out.println("Addition has been performed");
    }
}
class PerformAdd{
    static int add(int a ,int b){
        return a+b;
    }
}
public class StaticMethodReference {
    public static void main(String[] args) {
        Addition a =PerformAdd::add;
        a.show();
        System.out.println(a.sum(2,6));
        Addition.display();
    }
}
