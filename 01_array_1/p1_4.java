public class p1_4 {
    public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        // int sum=0; int max= Integer.MIN_VALUE;
        // for(int i =0; i<n;i++){
        //   sum+=arr[i];
        //   if(sum>max){max=sum;}
        //   if(sum<0){sum=0;}           //this is wrong because for higher value of sum, int will give error;
        // }
        // return max;
        long maxSum = Long.MIN_VALUE, sum = 0;
		for(int i=0;i<n;i++){
			sum += arr[i];
			maxSum = Long.max(maxSum, sum);
			if(sum<0){                   // KADANE'S ALGO
				sum = 0;
			}
		}
		if(maxSum <0) return 0;
		return maxSum;
	}
}
