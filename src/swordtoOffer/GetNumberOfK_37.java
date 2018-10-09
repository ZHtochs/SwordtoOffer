package swordtoOffer;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-08 16:06
 **/
public class GetNumberOfK_37 {
    public int GetNumberOfK(int [] array , int k) {
        if (array==null)
            return 0;
        return search(array,k+0.5)-search(array,k-0.5);
    }
    private int search(int[] array,double k){
        int start=0;
        int end=array.length-1;
        int mid=(start+end)>>1;

        while (start<=end){
            mid=(start+end)>>1;
            start=(array[mid]<k)?mid+1:start;
            end=(array[mid]>k)?mid-1:end;
        }
        System.out.println(start);
        return start;
    }

    public static void main(String[] args) {
        int[] a={1,3,3,3,3,4,5};
        GetNumberOfK_37 getNumberOfK_37=new GetNumberOfK_37();
        System.out.println(getNumberOfK_37.GetNumberOfK(a,3));;
    }
}