import java.util.*;
public class p4_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] kl = new int[nums.length];
        for (int i =0; i<nums.length; i++){
            for (int j =0; j<i; j++){
                if (nums[i]==kl[j]){
                    return new int[] {i,j};
                }
            }
            kl[i]=target-nums[i];
        }
        return new int[] {};
    }

    public int[] twoSum_2(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            Integer a= (Integer)nums[i];
            if (hs.containsKey(a)){
                return new int[] {hs.get(nums[i]), i};
            }
            hs.put(target-nums[i],i);
        }
        return new int[] {};
    }

    //if we are asked to just say yes/no, then we have better approach than this
    //then we can just sort the array, and then using two pointer, initially one is zero and second is last, we can et answer
}
