package org.example.SortingAlgorithms;

public class SelectionSort {

    public void selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int temp=0;
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex] >arr[j]){
                    minIndex=j;
                }
            }
            if(i!=minIndex) {
                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
