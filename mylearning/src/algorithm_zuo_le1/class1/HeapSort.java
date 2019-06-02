package algorithm_zuo_le1.class1;

import static Util.Swap.swap;

public class HeapSort {
    public static void heapSort(int[] arr){
        if(arr == null || arr.length <2){
            return;
        }

        for(int i = 0;i<arr.length;i++){
            heapInsert(arr,i);  //建立大根堆
        }

        int size= arr.length;
        swap(arr,0,--size); //出堆

        while(size > 0){
            heapify(arr,0,size); //调整堆
            swap(arr,0,--size);
        }

    }

    public static void heapInsert(int[] arr,int index){
        while(arr[index] > arr[(index-1)/2]){
            swap(arr,index,(index-1)/2);
            index = (index-1)/2;
        }
    }

    public static void heapify(int[] arr,int index,int size){
        int left = index*2 +1;
        while(left < size){
            int largest = left + 1 <size && arr[left+1] > arr[left] ? left+1:left;
            largest = arr[largest]> arr[index]? arr[largest]:index;
            if(largest == index) break;
            swap(arr,largest,index);
            index = largest;
            left = index *2 +1;
        }
    }

}
