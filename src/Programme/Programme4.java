package Programme;

import java.util.ArrayList;

/**Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.*/
public class Programme4 {
    public static void main(String[] args) {
        String colours;
        ArrayList<String>  col= new ArrayList<>();
        col.add("Red");
        col.add("White");
        col.add("Black");
        col.add("Blue");
        col.add("Purple");
        for (Object  colour: col)
              {
            System.out.println(colour);

        }
        
    }
}
