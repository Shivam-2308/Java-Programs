package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplierInterface {
    public static void main(String[] args) {
        //accept
        Consumer<String>c =s-> System.out.println(s);
        c.accept("This is a Consumer interface");

        //andThen
        Consumer<String>c1 =s-> System.out.println(s.toUpperCase());
        Consumer<String>c2 =s-> System.out.println(s.length());
        Consumer<String>c3 =c1.andThen(c2);
        c3.accept("Shivam");

        //biConsumer

        BiConsumer<String,Integer> bc =(s, i)-> System.out.println(s+" "+i);
        bc.accept("Shivam",10);

        //supplier
        Supplier<String>s =()->"Prajapati";
        System.out.println(s.get());

    }
}
