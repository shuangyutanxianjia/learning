package algorithm_zuo_le1.class1;

import java.util.Arrays;

import static Util.Swap.swap;

public class bubbleSort {
    public static void bubblesort(int[] arr){
        if(arr == null || arr.length <2){
            return;
        }
        for(int end = arr.length -1;end >= 0; end--){
            for(int i = 0; i < end;i++){
                if(arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }

    public static  int[] generateRandomArray(int size,int value){
        //生成长度随机的数组
        int[] arr = new int[(int)((size+1)*Math.random())];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (int)((value+1)*Math.random()) - (int)((value+1)*Math.random());
        }
        return arr;
    }

    public static void rightMathSort(int[] arr){
        Arrays.sort(arr);
    }

    private static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // for test
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 10;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            bubblesort(arr1);
            rightMathSort(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        bubblesort(arr);
        printArray(arr);
    }

}
