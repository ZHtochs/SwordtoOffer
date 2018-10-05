package others;

public class feibonaqie {
    public  static int  feibo1(int n){
        if(n==0 || n==1){
            return 1;
        }
        return feibo1(n-1)+feibo1(n-2);
    }
    public static double feibo2(int n){
        double a=1;
        double b=1;
        double sum=0;
        if(n==0 || n==1){
            return 1;
        }
        for (int i = 1; i <n ; i++) {
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(feibo2(i));
        }
    }
}
