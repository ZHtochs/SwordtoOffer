package swordtoOffer;

public class minNumberInRotateArray {
    public static int NumberOf1(int n) {
        int flag=n>0?0:1;
        n=n>0?n:(2147483647+n+1);
        int sum=0;
        while(n!=0){
            sum=sum+(n%2==0?0:1);
            n=n/2;
        }
        return sum+flag;

    }
}
