import java.util.*;

public class p2_5 {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        long p=(long)n;
        long sn = p*(p+1) /2;
        long s2n = p*(p+1)*(2*p+1) /6;
        long arr_sn=0L; Long arr_s2n = 0L;
        for(int i=0;i<n;i++){
            arr_sn+=(long)arr.get(i);
            arr_s2n+=(long)arr.get(i) * (long)arr.get(i);
        }
        long repeat = (arr_sn-sn +((arr_s2n-s2n)/(arr_sn-sn)))/2;
        long missing = sn+repeat-arr_sn;
        int[] ans={(int)missing,(int)repeat};
        return ans;
    }
}
