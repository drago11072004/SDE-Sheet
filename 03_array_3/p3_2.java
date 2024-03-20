public class p3_2 {
    public double myPow(double x, int n) {
        long nn=n;
        double ans =1;
        if(nn<0){nn=-1*nn;}
        while(nn>0){
            if(nn%2==0){x=x*x;nn=nn/2;}
            else{ans=ans*x;nn=nn-1;}
        }
        if(n<0){return 1/ans;}
        return (double)ans;
        
    }
}
