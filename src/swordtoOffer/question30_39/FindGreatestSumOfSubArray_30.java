package swordtoOffer.question30_39;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-07 18:05
 **/
public class FindGreatestSumOfSubArray_30 {
    /**
     * 非动态规划
     *
     * @Param: [array]
     * @return: int
     */

    public int FindGreatestSumOfSubArray(int[] array) {

        int sum = array[0];
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp += array[i];
            temp=Math.max(temp,array[i]);
            sum=Math.max(sum,temp);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {6, -3, -2, 7, -15, 1, 2, 2};
        FindGreatestSumOfSubArray_30 find = new FindGreatestSumOfSubArray_30();
        find.FindGreatestSumOfSubArray(a);
    }
}