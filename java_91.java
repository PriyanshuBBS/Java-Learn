import java.util.*;

public class java_91 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5); // Initial capacity 5 

        l1.add(6);
        l1.add(7);
        l1.add(3);
        l1.add(6);
        l1.add(0,5); // add 5 at 0th index
        l1.addAll(0,l2);
        System.out.println(l1.contains(7));

        System.out.println(l1.indexOf(6)); //returns index of 6 if present
        
        // If multiple value then shows the last index
        System.out.println(l1.lastIndexOf(6));

        l1.set(1,566);

        // l1.clear(); // clears the array
        System.out.println("Printing Array....");
        for(int i=0; i<l1.size();i++)
        {
            System.out.print(l1.get(i) + " ");
        }

    }
}
