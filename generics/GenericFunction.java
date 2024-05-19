package generics;



class GenericFunction {
    // A Generic method example
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }
    static <T extends Number,U extends Number> double add(T e1,U e2){
        return e1.doubleValue()+e2.doubleValue();

//        return e1+e2;             //not allowed beacuse T cannot allowed to work with operator
    }
    // Driver method
    public static void main(String[] args)
    {
        genericDisplay(11);
        genericDisplay("GeeksForGeeks");
        genericDisplay(1.0);
        double sum=add(4,5.7);
        System.out.println(sum);
    }
}