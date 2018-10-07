package swordtoOffer;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-07 19:10
 **/
public class NumberOf1Between1AndN_31 {

    public int NumberOf1Between1AndN_Solution(int n) {
        if(n==0){
            return 0;
        }
        if(n>0 && n<10){
            return 1;
        }
        Character c= Integer.toString(n).toCharArray()[0];
        int first=Integer.parseInt(c.toString());
        int length=Integer.toString(n).length();
        int sum=0;

        if(first==1){
            sum= NumberOf1Between1AndN_Solution((int)Math.pow(10,length-1)-1)+ NumberOf1Between1AndN_Solution((int)(n-Math.pow(10,length-1)))+(n-(int)Math.pow(10,length-1)+1);
            return sum;
        }
        else {
            sum= NumberOf1Between1AndN_Solution(n-(int)Math.pow(10,length-1)*first)+ NumberOf1Between1AndN_Solution((int)Math.pow(10,length-1)*first-1);
            return sum;
        }
    }

    public static void main(String[] args) {
        NumberOf1Between1AndN_31 number = new NumberOf1Between1AndN_31();
        number.NumberOf1Between1AndN_Solution(100);
        System.out.println("asd"+number.NumberOf1Between1AndN_Solution(101));
    }
}