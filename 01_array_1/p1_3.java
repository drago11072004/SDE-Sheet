import java.util.*;
public class p1_3 {
    public static ArrayList<Integer> nextPermutation_NOTCOMPLETE(ArrayList<Integer> permutation) 
	{
		// Write your code here.
        int len = permutation.size();
        int x = permutation.get(len-1);
        permutation.set(len-1, permutation.get(len-2));
        permutation.set(len-2, x);
        return permutation;
	}
}
