import java.util.ArrayList;
import java.util.Iterator;
//Write a Java program to iterate through all elements in an array list using
//Iterator.
public class Pro5 {
    //Write a Java program to iterate through all elements in an array list using
    //Iterator.
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<String>();
        list.add("Yellow");
        list.add("Red");
        list.add("white");
        list.add("purple");
        list.add("orange");
        list.add("Rainbow");
        //list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){//Check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }
    }
}