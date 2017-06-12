package arry;

/**
 * Created by lenovo on 2017/5/10.
 */
public class Myarry {
    public static void main(String[] args) {
            int [][] a={
                        {1,2},
                        {2,3},
                    };
            int[][]b ={
                    {4,4},
                    {6,7},
            };
            printarry(a);
            int c[][]=addarry(a,b);
            printarry(c);
    }
    public static void printarry(int [][] c) {
        //打印矩阵
        for (int i = 0; i <c.length ; i++) {
            for (int j = 0; j <c.length ; j++) {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }

    /**
     * 矩阵加法
     * @param a
     * @param b
     * @return
     */
    public static int[][] addarry(int[][] a ,int[][] b){
       int c[][]= new int[a.length][a.length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j <c.length ; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
     return c;
    }

}
