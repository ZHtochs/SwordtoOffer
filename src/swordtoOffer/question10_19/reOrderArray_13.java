package swordtoOffer.question10_19;
/*
* 输入一个整数数组，
* 实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
* 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。*/
public class reOrderArray_13 {
    public static void reOrderArray(int [] array) {

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] % 2 == 1) {
                    temp = array[j];
                    for (int k = j; k > i; k--) {
                        array[k] = array[k - 1];
                    }
                    array[i] = temp;
                    break;
                }
            }

        }
    }

}
