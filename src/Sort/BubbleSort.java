package Sort;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/7/9.
 */
public class BubbleSort {


    public static void main(String[] args) {
        int[] arr ={1,2,9,3,4};
        sort(arr);
        String a;
    }

    public static void sort(int[] arr) {
        boolean sorted = true;//重要部分
        int len =arr.length;
        for (int i = 0; i < len-1; i++) {
            sorted = true;
            for (int j = 0; j < len-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        System.out.println(""+ Arrays.toString(arr));
    }
}
