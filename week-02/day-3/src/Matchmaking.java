import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<String>();

        // Join the two lists by matching one girl with one boy in the order list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        for (int i = 0; i <= 5; i++) {
            if (i != 5) {
                order.add(girls.get(i));
                order.add(boys.get(i));
            } else {
                order.add(boys.get(i));
            }
        }
        System.out.println(order);
    }
}