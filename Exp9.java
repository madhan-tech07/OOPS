import java.util.*;

public class ArrayListExample {
    public static void main(String args[]) {
        /* Creation of ArrayList: String elements */
        ArrayList<String> obj1 = new ArrayList<String>();

        /* Adding elements to the array list */
        obj1.add("Ajeet");
        obj1.add("Harry");
        obj1.add("Chaitanya");
        obj1.add("Steve");
        obj1.add("Anuj");

        /* Displaying array list elements */
        System.out.println("\nCurrently the array list obj1 has following elements: " + obj1);

        /* Append element at the end */
        obj1.add("Babu");
        obj1.add("Kamal");

        /* Append collection elements to ArrayList */
        ArrayList<String> obj2 = new ArrayList<String>();
        obj2.add("Alice");
        obj2.add("Bob");
        obj2.add("Raj");

        // Adding ArrayList obj2 into ArrayList obj1
        obj1.addAll(obj2);
        System.out.println("\nArrayList obj1 after addAll: " + obj1);

        /* Add element at the given index */
        obj1.add(0, "Rahul");
        obj1.add(1, "Justin");
        System.out.println("\nArrayList obj1 after adding elements at given indices: " + obj1);

        /* Search an element */
        System.out.println("\nEnter the Search element:");
        Scanner input = new Scanner(System.in);
        String search = input.nextLine(); // Fixed invalid data type "dString"

        System.out.println("\nArrayList obj1 contains the string " + search + " : " + obj1.contains(search));

        /* Remove elements from array list */
        obj1.remove("Chaitanya");
        obj1.remove("Harry");
        System.out.println("\nCurrent array list of obj1 after removing elements: " + obj1);

        /* Remove element from the given index */
        obj1.remove(1);
        System.out.println("\nCurrent array list of obj1 after removing element at index 1: " + obj1);

        /* Search for names starting with a specific letter */
        System.out.println("\nEnter the letter to display all strings starting with given letter:");
        search = input.nextLine();

        ArrayList<String> obj3 = new ArrayList<String>();
        for (int i = 0; i < obj1.size(); i++) {
            // Case-insensitive prefix search
            if (obj1.get(i).toLowerCase().startsWith(search.toLowerCase())) {
                obj3.add(obj1.get(i));
            }
        }

        if (obj3.size() > 0) {
            System.out.println("\nArrayList obj1 contains all strings starting with " + search + ": " + obj3);
        } else {
            System.out.println("\nNo names start with '" + search + "' in ArrayList obj1");
        }

        input.close();
    }
}