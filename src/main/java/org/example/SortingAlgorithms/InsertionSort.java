package org.example.SortingAlgorithms;

public class InsertionSort {

    //Insertion sort is the only sort that gives time complexity O(N) when the algorithm is run on array which is sorted or almost sorted case

    public void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
