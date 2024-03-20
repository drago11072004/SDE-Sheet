import java.util.*;
public class p7_3 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
		Arrays.sort(nums);
		for(int i=0;i<n;i++){
			if(i>0 && nums[i]==nums[i-1]){continue;}
			int l=n-1,j=i+1;
			while(j<l){
				if(j>i+1 && nums[j]==nums[j-1]){j++;continue;}
				if(l<n-1 && nums[l]==nums[l+1]){l--;continue;}
				long sum=nums[j]+nums[l]+nums[i];
				if(sum==0){
					List<Integer> temp=new ArrayList<>();
					temp.add(nums[i]);temp.add(nums[j]);temp.add(nums[l]);
					ans.add(temp);j++;l--;
				}
				else if(sum<0){j++;}
				else{l--;}
			}
		}
		return ans;
    }
}
