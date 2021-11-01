import java.util.ArrayList;

public class Pro7 {
    //Write a Java program to test an array list is empty or not. Define array list with
    //underground tuWrite a Java program to test an array list is empty or not. Define array list with
    //underground tube names
    public static void main(String[] args) {



                ArrayList<String> al = new ArrayList<String>();
                // before checking ArrayList using isEmpty() method
                System.out.println("Is ArrayList empty: " + al.isEmpty());
                al.add("Central");
                al.add("Jubliee");
                al.add("Bakerloo");
                al.add("Metropolitan Line");
                // after checking ArrayList using isEmpty() method
                System.out.println("Is ArrayList empty: " + al.isEmpty());
                for(String tube : al)
                {
                    System.out.println(tube);
                }
            }
        }







