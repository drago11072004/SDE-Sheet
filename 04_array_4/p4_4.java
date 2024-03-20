import java.util.*;
public class p4_4 {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		int n=arr.size();
		HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        int maxi = 0;
        int sum = 0; 
		int k=0;         //here k can be any value;
        for(int i = 0;i<n;i++) {
            sum += arr.get(i); 
            if(sum == k) {
                maxi = i + 1; 
            }
            else {
                if(mpp.get(sum-k) != null) {
                    maxi = Math.max(maxi, i - mpp.get(sum-k)); 
                }
                else {
                    mpp.put(sum-k, i); 
                }
            }
        }
        return maxi;
	}
    
}
