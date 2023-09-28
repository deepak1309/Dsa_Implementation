package org.example.SortingAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

    //Merge Sort has Time complexity as O(n logn)  and it has Space complexity as O(n).

    private int[] merge(int[] arr1,int[] arr2){
        int[] combineArray = new int[arr1.length+arr2.length];
        int index=0;
        int i=0;
        int j=0;

        while(i< arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                combineArray[index] = arr1[i];
                i++;
                index++;
            }
            else{
                combineArray[index] = arr2[j];
                j++;
                index++;
            }
        }
        while(i<arr1.length){
            combineArray[index]=arr1[i];
            i++;
            index++;
        }
        while(j<arr2.length){
            combineArray[index]=arr2[j];
            j++;
            index++;
        }

        return combineArray;
    }

    public int[] mergeSort(int[] array){
        if(array.length==1) return array;
       int middleIndex = array.length/2;
       int[] leftArray = mergeSort(Arrays.copyOfRange(array,0,middleIndex));
       int[] rightArray =mergeSort(Arrays.copyOfRange(array,middleIndex,array.length));

       return merge(leftArray,rightArray);
    }
}
