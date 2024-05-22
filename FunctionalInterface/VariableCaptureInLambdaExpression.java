package FunctionalInterface;

import java.util.function.Function;

public class VariableCaptureInLambdaExpression {
    int n;
    static int y;
    final int a=10;
    public static void main(String[] args) {
        VariableCaptureInLambdaExpression v = new VariableCaptureInLambdaExpression();
        int x= 10;
        Function<Integer,Integer>f=num->{
            int value;
            v.n=10; //instance variable modification allowed
            v.n++;
            System.out.println("n="+v.n);
            y=5;
            y++;  //static variable modifiaction is allowed
            System.out.println("Value of y="+y);
            value= num;  //Allowed
            //x++; //Local variable modification is not allowed
            //x=3  //Not Allowed
            return value;
        };
        x=10;  //x become effectively final
        v.n=20;
        System.out.println(f.apply(20));
    }
}
