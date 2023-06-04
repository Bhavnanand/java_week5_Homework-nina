package Programme;

import java.util.HashMap;

/**Create a HashMap object called people that will store String keys and Integer
 values: And use for each loop to iterate the value from Map.*/
public class StoreNoName_Program9 {
 public static void main(String[] args) {

 // Create a HashMap object called people
 HashMap<String,Integer> people = new HashMap<String,Integer>();


 // Add keys and values (Name, Age)
 people.put("Josh",12);
 people.put("Smith",23);
 people.put("Angie",32);

 for (String i : people.keySet()) {
 System.out.println("key: " + i + " value: " + people.get(i));
 }
 }


}
