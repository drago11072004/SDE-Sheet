public class p11_1 {
    public static double multiply(double m,double n){
        double res=1;
        for(int i=0;i<n;i++){
            res*=m;
        }
        return res;
    }
    public static double NthRoot(int n, int m) {
        // Write your code here.
        double low=1, high=m;
        double eps = 1e-7;
        while(high-low>eps){
            double mid=low+high/2;
            if(multiply(mid,n)>=m){high=mid;}
            else{low=mid;}
        }
        return low;
    }

    
}
