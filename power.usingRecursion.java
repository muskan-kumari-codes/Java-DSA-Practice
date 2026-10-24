class Solution {
public:
    double myPow(double x, int n) {
        //your code goes here
        if(n==0) return 1;

        return n*myPow(x,n-1);
    }
};
