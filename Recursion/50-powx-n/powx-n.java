class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        while(N>0){
            if((N&1)==1){
                ans = ans*x;
            }
            x*=x;
            N >>= 1;
        }
        return ans;

    }
}

/*
class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;
        double ten = pow(1.0,10,x);
        double ans = 1.0;
        long i = Math.abs(n)/10;
        while(i>0){
            ans = ans*ten;
        }
        ans = ans*pow(1.0,Math.abs(n%10),x);
        return (n>0)? ans : 1.0/ans;
    }
    public double pow(double result , long n , double x){
        if(n==0) return result;
        return x*pow(result,--n,x);
    }
}
 */

/*
class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;
        double result = 1.0;
        return (n>0)? pow(result,n,x) : 1.0/pow(result,Math.abs(n),x) ;
    }
    public double pow(double result , int n , double x){
        if(n==0) return result;
        return x*pow(result,--n,x);
    }
}
 */