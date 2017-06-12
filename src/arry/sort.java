package arry;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by lenovo on 2017/5/10.
 */
public class sort {
    public static void main(String[] args) {
        int[] a = {1, 3, 2,54, 1, 3,545, 4, 412,46,85,646,878,66};
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-i-1 ; j++) {
                if (a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        herf(a ,8);
        System.out.println();
    }
    public static void herf(int[] a ,int v){
        for (int i=0;i<a.length/2;i++){
            if (a[i]==v){
                System.out.println(i);
            }
        }
    }
}