package org.example;

public class Main {
    static void QuickSort(int[] inputArray, int minIndex, int maxIndex) {
        if (minIndex >= maxIndex) return;
        int pivot = GetPivotIndex(inputArray, minIndex, maxIndex);
        QuickSort(inputArray, minIndex, pivot - 1);
        QuickSort(inputArray, pivot + 1, maxIndex);
        return;
    }
    static int GetPivotIndex(int[] inputArray, int minIndex, int maxIndex) {
        int pivotIndex = minIndex - 1;
        for (int i = minIndex; i <= maxIndex; i++)
        {
            if (inputArray[i] < inputArray[maxIndex])
            {
                pivotIndex++;
                Swap(inputArray, i, pivotIndex);
            }
        }
        pivotIndex++;
        Swap(inputArray, pivotIndex, maxIndex);
        return pivotIndex;
    }
    static void Swap(int[] inputArray, int leftValue, int rightValue) {
        int temp = inputArray[leftValue];
        inputArray[leftValue] = inputArray[rightValue];
        inputArray[rightValue] = temp;
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 0, -5, 2, 3, 5, 9, -1, 7 }; // инициализация исходного массива
        printArray(arr);
        QuickSort (arr, 0, arr.length - 1);
        printArray(arr);
    }
}