package MethodReferencePractice;

@FunctionalInterface
interface Finder{
    int find(String s1,String s2);
//    int show(int a);
}
class IndexOf{
    int search(String s1,String s2){
        return s1.indexOf(s2);
    }
}
public class ParameterMethodRefernce {
    public static void main(String[] args) {
        IndexOf i = new IndexOf();
        Finder f = i::search;
//        Finder f1=IndexOf::search;  ??
        System.out.println(f.find("Shivam","a"));
    }
}
