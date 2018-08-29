package swordtoOffer;

public class reOrderArray {
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
