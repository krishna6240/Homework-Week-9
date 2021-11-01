import java.util.ArrayList;
//Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.
public class Pro4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Yellow");
        list.add("Red");
        list.add("white");
        list.add("purple");
        list.add("orange");
        list.add("Rainbow");
        //printout the collection using for each loop.
        for(String color:list)
        System.out.println(color);

    }
}
