import  java.util.*;

public class IterableEX {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        Collection<String> collection = list;
        Iterable<String> iterable = collection;

        for(String element : iterable){
            System.out.print(element);
            System.out.println("\n");
        }
    } 
}
