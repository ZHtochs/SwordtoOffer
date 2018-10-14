package swordtoOffer.question50_59;

/**给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-11 19:53
 **/
public class multiply_51 {
    public static  int[] multiply(int[] A) {
        int[] b=new int[A.length];
        b[0]=1;

      for (int i=1;i<A.length;i++){
          b[i]=b[i-1]*A[i-1];
      }
      int temp=1;
      for (int j=A.length-2;j>=0;j--){
          temp *= A[j+1];
          b[j] *= temp;
      }
      return b;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        for (int z:multiply(a)
             ) {
            System.out.println(z);

        }
    }
}