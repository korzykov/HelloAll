package ArraysAndLoops_2;

// скопировать элементы с одного массива в другой

import java.util.Arrays;

public class TaskAdd2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = new int[9];
        System.arraycopy(array1, 4, array2, 3, 5);
        for (int i : array2) {
            System.out.println(i);
        }
        System.out.println(Arrays.equals(array1, array2));
    }

}
