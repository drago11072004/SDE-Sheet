public class p3_3 {
    public int majorityElement(int[] nums) {
        int element=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element){count++;}           //it's moore's votes algorithm; it's obvious that if one element is more than 
            else{                           // n/2 times then it wil not be cancelled to zero
                count--;
                if(count==0){element=nums[i+1];}     //here it's given that such element alwas exists, otherwise we also neww to
            }            // whether the element is majority or not.
        }
        return element;
    }
}
