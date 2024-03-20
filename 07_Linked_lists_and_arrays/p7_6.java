public class p7_6 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                len++;
                if(ans<len){ans=len;}
            }
            else{len=0;}
        }
        return ans;
    }
}
