package arry;

import java.util.Arrays;

/**快速排序
 * Created by lenovo on 2017/6/2.
 */
public class fistArry {
    public static void main(String[] args) {
        int sortarray[] = {45,26,34,2,88,54,23, 43,34,56,55,45,54,78,4,23};
        sort(sortarray,0,sortarray.length-1);
        System.out.println(Arrays.toString(sortarray));
    }
    private static void sort(int arr[],int low,int high){
        //当数组长度大于1
        if(low<high){
            int l = low;
            int h = high;
            int base =arr[low];

            //循环结束将数组分成2部分
            while (l<h){
                //左-->右，查找小于base的数
                while (l<h && arr[h]>=base){
                    h--;
                }
                if (l < h) {
                    arr[l] = arr[h];
                    l++;
                }
                //左-->右，查找大于base的数
                while (l<h&&arr[l]<base){
                    l++;
                }
                if(l<h){
                    arr[h]=arr[l];
                    h--;
                }

            }
            arr[l]=base;
            //递归
            sort(arr,low,l-1);
            sort(arr,l+1,high);
        }
    }

}
