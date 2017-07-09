package Sort;

import java.util.Comparator;
import java.util.List;

/**
 * 排序
 * @author Administrator
 *
 */
public class Utils {
    /**
     * List的排序+比较器
     * @param list
     * @param com
     */
    public static  <T> void sort(List<T> list,Comparator<T> com){
        //第一步:转成数组
        Object[] arr =list.toArray();
        sort(arr,com);
        //第二步:改变容器中对应的值
        for(int i=0;i<arr.length;i++){
            list.set(i, (T)(arr[i]));
        }
    }


    /**
     * 数组的排序 （降序）+Comparator接口
     * @param arr
     */
    public static <T> void sort(Object[] arr,Comparator<T> com){
        //从大到小排序 降序
        boolean sorted= true;
        int len =arr.length;
        for(int j=0;j<len-1;j++){ //趟数
            sorted =true; //假定有序
            for(int i=0;i<len-1-j;i++){ //次数
                if(com.compare((T)arr[i], (T)arr[i+1])<0){
                    Object temp = arr[i];
                    arr[i] =arr[i+1];
                    arr[i+1] =temp;
                    sorted =false; //假定失败
                }
            }
            if(sorted){ //减少趟数
                break;
            }
        }
    }



    /**
     * 容器排序 (使用泛型方法)
     */
    public static <T extends Comparable<T>> void sort(List<T> list){
        //第一步:转成数组
        Object[] arr =list.toArray();
        sort(arr);
        //第二步:改变容器中对应的值
        for(int i=0;i<arr.length;i++){
            list.set(i, (T)(arr[i]));
        }

    }


    /**
     * 数组排序 (使用泛型方法)
     */
    public static <T extends Comparable<T>> void sort(T[] arr){
        //从大到小排序 降序
        boolean sorted= true;
        int len =arr.length;
        for(int j=0;j<len-1;j++){ //趟数
            sorted =true; //假定有序
            for(int i=0;i<len-1-j;i++){ //次数
                if(((Comparable)arr[i]).compareTo(arr[i+1])<0){
                    T temp = arr[i];
                    arr[i] =arr[i+1];
                    arr[i+1] =temp;
                    sorted =false; //假定失败
                }
            }
            if(sorted){ //减少趟数
                break;
            }
        }
    }

    /**
     * 数组的排序 （降序）
     * @param arr
     */
    public static void sort(Object[] arr){
        //从大到小排序 降序
        boolean sorted= true;
        int len =arr.length;
        for(int j=0;j<len-1;j++){ //趟数
            sorted =true; //假定有序
            for(int i=0;i<len-1-j;i++){ //次数
                if(((Comparable)arr[i]).compareTo(arr[i+1])<0){
                    Object temp = arr[i];
                    arr[i] =arr[i+1];
                    arr[i+1] =temp;
                    sorted =false; //假定失败
                }
            }
            if(sorted){ //减少趟数
                break;
            }
        }

    }


}
