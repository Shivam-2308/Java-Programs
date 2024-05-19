package Collections.Iterator;

import java.util.*;

public class Iterator1 {
    public static void main(String[] args) {
//        ArrayList<Integer>list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        Iterator<Integer>it = list.iterator();
//        while(it.hasNext()){
//            int num = it.next();
//            System.out.println(num);
//
//            //Removing the even elements
//            if(num%2==0){
//                it.remove();
//                System.out.println("Removed elements are: "+num);
//            }
//        }
//        System.out.println("List after removal of elements: ");
//        for(Integer i : list){
//            System.out.println(i);
//        }

        //Enumeration in java

        // Creating a vector

//        Vector<Integer> vector = new Vector<>();
//        vector.add(1);
//        vector.add(2);
//        vector.add(3);
//
//        // Getting an enumeration from the vector
//        Enumeration<Integer> enumeration = vector.elements();
//
//        // Looping through the elements of the vector using the enumeration
//        while (enumeration.hasMoreElements()) {
//            int  number = enumeration.nextElement();
//            System.out.println(number);
//            if(number%2==0){
////                enumeration.remove();          //enumeration do not support remove method but iterator support this.
//            }
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "RAM1");
        map1.put(2, "RAM2");
        map1.put(3, "RAM3");
        map1.put(4, "RAM4");
        Map<Integer, String> map2 = new HashMap<>(map1);
        System.out.println(map2);
    }
}

