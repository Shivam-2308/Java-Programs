package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionInterface {
    public static void main(String[] args) {
        //Function Interface
        List<Integer>list = Arrays.asList(1,2,3,4,5,6,7);
        Function<List<Integer>,List<Integer>>lst =l1->{
            List<Integer>list1 =new ArrayList<>();
            for (int i : l1){
                if(i%2==0){
                    list1.add(i);
                }
            }
            return list1;
        };
        System.out.println("Resultant list is: "+lst.apply(list));

        //andThen
        Function<String,String>f1=s->s.toUpperCase();
        Function<String,String>f2=s->s.substring(0,4);
        System.out.println(f2.andThen(f1).apply("Shivam"));

        //compose
        System.out.println(f1.compose(f2).apply("Shivam"));

        //identity
        Function<String,String>f3=Function.identity();
        System.out.println(f3.apply("Prajapati"));

        //BiFunctional
        BiFunction<Integer,Integer,Integer>bi =(a,b)->a+b;
        System.out.println(bi.apply(4,6));

        //UnaryOperator
        UnaryOperator<String>un = s->s.toUpperCase();
        System.out.println(un.apply("Prajapati"));

        //BinaryOperator
        BinaryOperator<String>bn =(s1,s2)->s1+s2;
        System.out.println(bn.apply("Shivam","Kumar"));
    }
}
