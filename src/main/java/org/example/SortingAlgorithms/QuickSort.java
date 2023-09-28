package org.example.SortingAlgorithms;

public class QuickSort {
    private void swap(int[] array,int firstIndex,int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }

    private int quickSortPivot(int[] array,int pivotIndex,int endIndex){
        int swapIndex = pivotIndex;
        for(int i=pivotIndex+1;i<endIndex;i++){
            if(array[i]<array[pivotIndex]){
                swapIndex++;
                swap(array,swapIndex,i);
            }
        }
        swap(array,swapIndex,pivotIndex);

        return swapIndex;
    }

    private void quickSortHelper(int[] arr,int left,int right){
        if(left<right) {
            int pivotIndex = quickSortPivot(arr, left, right);
            quickSortHelper(arr, left,pivotIndex-1);
            quickSortHelper(arr,pivotIndex+1,right);
        }
    }

    public void quickSort(int[] arr){
        quickSortHelper(arr,0, arr.length);
    }
}
