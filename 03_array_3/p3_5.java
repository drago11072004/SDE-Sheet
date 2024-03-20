public class p3_5 {
    public static int uniquePaths(int m, int n) {
		// Write your code here.
		int[] dp = new int[n];
        for(int k=0; k<n; k++){dp[k]=1;}
        for (int p=1; p<m;p++ ){
            for(int q=1; q<n;q++){
                dp[q]=dp[q-1]+dp[q];
            }
        }
        return dp[n-1];
	}
}
