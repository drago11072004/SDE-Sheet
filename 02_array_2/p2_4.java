import java.util.*;

public class p2_4 {
    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        // Write your code here.
        for (int i = 0; i < n; i++) {
            int num = arr.get(i); // worst mtd that u used
            for (int j = i + 1; j < n; j++) {
                if (num == arr.get(j)) {
                    return num;
                }
            }
        }
        return 0;
    }
    // u can sort the array and then check, T=O(nlogn) & S= o(1)
    // as all number are between 1 to n-1 u can use nother array and mark how many
    // times they occur; T=O(n) & S=O(n)

    public static int findDuplicate_1(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int slow = arr.get(0);
        int fast = slow;
        do {
            slow = arr.get(slow); // OPTIMAL WAY
            fast = arr.get(arr.get(fast)); // ALSO A WAY TO FIND THE STARTING POINT OF A LOOP IN LINKED LIST
        } while (slow != fast);
        fast = arr.get(0);
        while (slow != fast) {
            slow = arr.get(slow);
            fast = arr.get(fast);
        }
        return slow;
    }

}
