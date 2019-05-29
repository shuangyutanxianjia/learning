package algorithm_zuo_le1.class1;

import static Util.Swap.swap;

public class InsertSort {
    public static void insertSort(int[] arr){
        if(arr == null || arr.length <2) return;
        for(int i = 1;i<arr.length;i++){
            for(int j = i-1;j>=0 && arr[j]>arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }
    }
}
