package algorithm_zuo_le1.class1;

import static Util.Swap.swap;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        if(arr == null || arr.length<2) return;
        for(int i = 0; i<arr.length;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                minIndex = arr[j]<arr[minIndex]?j:minIndex;
            }
            swap(arr,i,minIndex);
        }
    }
}
