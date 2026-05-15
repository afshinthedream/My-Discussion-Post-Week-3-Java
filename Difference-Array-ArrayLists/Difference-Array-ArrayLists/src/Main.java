import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) {

        // Arrays always FIXED size
        int[] numbers = new int[3];
        numbers[0] = 15;
        numbers[1] = 30;
        numbers[2] = 45;

        System.out.println("Array elements:");
        for (int n : numbers) {
            System.out.println(n);
        }

        // numbers[3] = 60;  // ERROR: array cannot grow

        // ArrayLists which can GET LARGER and GET SMALLER
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(30);
        list.add(45);
        list.add(60); 
        
        // ArrayList expands automatically

        System.out.println("\nArrayList elements:");
        for (int n : list) {
            System.out.println(n);
        }

        list.remove(3); // removes element at index 3

        System.out.println("\nArrayList after removal:");
        for (int n : list) {
            System.out.println(n);
        }
    }
}
