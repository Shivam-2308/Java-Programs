package MethodReferencePractice;

interface Demo{
    Person create(int age,String name);
}
class Person{
    int age;
    String name;
    Person (int age,String name){
        this.age=age;
        this.name=name;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
}
public class ConstructorMethodReference {
    public static void main(String[] args) {
        Demo d = Person::new;
        Person p =d.create(30,"Shivam");
        System.out.println("Age is: "+p.getAge());
        System.out.println("Name is: "+p.getName());
    }
}
