import java.util.ArrayList;
import java.util.List;
//Write a Java program to retrieve an element (at a specified index) from a given
//array list

public class Pro6 {

    public static void main(String[] args) {
        //create a list and add some colors to the list
        List<String > list_Element = new ArrayList<String>();
        list_Element.add("Yellow");
        list_Element.add("Red");
        list_Element.add("white");
        list_Element.add("purple");
        list_Element.add("orange");
        list_Element.add("Rainbow");
        System.out.println(list_Element);
        //Retrieve the second and fourth element
        String element = list_Element.get(1);
        System.out.println("second element : " +element);
        element = list_Element.get(3);
        System.out.println("fourth element : " +element);
    }
}
