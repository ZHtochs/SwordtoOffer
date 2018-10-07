package swordtoOffer;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-07 21:26
 **/
public class PrintMinNumber_32 {
    String min = "中文";
    StringBuilder sb = new StringBuilder();
    public void setString(int[] numbers){
        sb.delete(0,sb.length());
        for (int i = 0; i <numbers.length ; i++) {
            sb.append(numbers[i]);
        }
    }
    public  String PrintMinNumber(int[] numbers) {
        if(numbers.length==0){
            return null;
        }
        PrintMinNumber(numbers,0);
        System.out.println(min);
        System.out.println(sb);
        return String.valueOf(min);
    }
    public  void PrintMinNumber(int[] numbers,int start){
        if (numbers == null || start==numbers.length) {
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            swap(numbers,start,i);
            setString(numbers);
            if(sb.toString().compareTo(min)<0){
                min=sb.toString();
            }
            PrintMinNumber(numbers,start+1);
            swap(numbers,start,i);
        }
    }
    public void swap(int[] chars, int i, int j) {
        int c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }

    public static void main(String[] args) {
        PrintMinNumber_32 printMinNumber_32=new PrintMinNumber_32();
        int[] a ={};
        printMinNumber_32.PrintMinNumber(a);


    }
}