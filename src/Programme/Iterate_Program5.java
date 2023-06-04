package Programme;

import java.util.ArrayList;
import java.util.Iterator;

/**Write a Java program to iterate through all elements in an array list using
        Iterater.*/
public class Iterate_Program5 {
    public static void main(String[] args) {
        String colours;
        ArrayList<String> col= new ArrayList<>();
        col.add("Red");
        col.add("White");
        col.add("Black");
        col.add("Blue");
        col.add("Purple");
        for (Object  colour: col
        ) {
            System.out.println(colour);

        }
        Iterator<String> colour = col.iterator();
        while(colour.hasNext()){
            System.out.println(colour.next());
        }

    }
}


