package swordtoOffer;

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
            if (temp < array[i]) {
                temp = array[i];
            }
            if (sum <= temp) {
                sum = temp;
            }
        }
        System.out.println(sum);
        return sum;
    }

    /**
     * 动态规划
     *
     * @Param: [array]
     * @return: int
     */

    public int FindGreatestSumOfSubArray_2(int[] arr) {
        int sum = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i] > arr[i] ? sum + arr[i] : arr[i];
            if (sum >= max) max = sum;
        }
        return max;

    }

    public static void main(String[] args) {
        int[] a = {6, -3, -2, 7, -15, 1, 2, 2};
        FindGreatestSumOfSubArray_30 find = new FindGreatestSumOfSubArray_30();
        find.FindGreatestSumOfSubArray(a);
    }
}