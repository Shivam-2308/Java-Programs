import javax.swing.*;
import java.util.Arrays;
import java.util.List;

class Box1{

    public void setContent(List<?>list){
        System.out.println(list);;
    }
//  public void add(? a,?b)

}
public class Generic {
    public static void main(String[] args) {
       List<Integer> l= Arrays.asList(1,2,3,4,5);
       Box1 b=new Box1();
       b.setContent(l);
    }
}
