import java.util.HashMap;
//. Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.

public class Pro9 {
    public static void main(String[] args) {
        //Create a HashMap object called people
        HashMap<String,Integer> people = new HashMap<String,Integer>();

        //Add keys and
        people.put("krishna",40);
        people.put("Samir",41);
        people.put("Veera",10);
        people.put("Parin",8);
        for(String i : people.keySet()){
            System.out.println("key:"  + "value:" + people.get(i));
        }

    }
}
