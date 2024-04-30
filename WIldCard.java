class Box<T>{
    private T value;
    public Box(T value){
        this.value= value;
    }
    public T getValue(){
        return value;
    }
}


public class WIldCard {
    public static void main(String[] args) {
    Box<Integer> val = new Box<>(10);
        System.out.println(val.getValue());
    }
}
