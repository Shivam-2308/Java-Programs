package Company1;

import java.util.*;

//@FunctionalInterface

//Lambda expression without arguments........
/*
interface MyFunctionalInterface{
    void myMethod();
}
public class Practice1 {
    public static void main(String[] args) {
        MyFunctionalInterface myfunc = ()-> System.out.println("I am the only abstract method of functional interface!!");
        myfunc.myMethod();
    }
}
*/

//Lambda expression arguments........

/*
interface MyFunctionalInterface{
    int myMethod(int a,int b);
}
public class Practice1 {
    public static void main(String[] args) {
        MyFunctionalInterface add = (a,b) -> a+b;
        System.out.println("Sum of two numbers is : "+add.myMethod(2,4));
    }
}
*/

//implementing the default method in interface A.T. java8

 /*
interface MyFunctionalInterface{
    int myMethod(int a,int b);
    default void show(){
        System.out.println("I am default method of interface!!");
    }
}
public class Practice1 {
    public static void main(String[] args) {
        MyFunctionalInterface add = (a,b) -> a+b;
        System.out.println("Sum of two numbers is : "+add.myMethod(2,4));
        add.show();
    }
}
 */

//wrapper class (Autoboxing and Unboxing in java)....

public class Practice1 {
    public static void main(String[] args) {
        //Autoboxing.....
       int a = 10;
       Integer b = a;
        System.out.println(a);
        System.out.println(b);

        //unboxing in java....
        Integer c= 20;
        int d = c;
        System.out.println(c);
        System.out.println(d);


    }
}