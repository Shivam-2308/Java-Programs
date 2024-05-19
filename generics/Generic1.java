package generics;

//Generic class
class Test<T,U>{
    T a;
    U b;
    Test(T a,U b){
        this.a=a;
        this.b=b;

    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class Generic1 {
    public static void main(String[] args) {
    Test<Integer,String>t = new Test<>(50,"Shivam");
    t.display();
    }
}
