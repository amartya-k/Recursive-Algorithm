package com.ravi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        //No of element you want in your array
     int[] arr = new int[n];
     for(int i=0;i<n;i++){//Enter all the elements of array
         arr[i]=sc.nextInt();
     }
     sort(arr,0,arr.length-1);
     System.out.println("sorted array is :");
     printArray(arr);
    }
   static void merge(int arr[], int p, int q, int r)
   {
        int n1 = q - p + 1;//Length of the left array
        int n2 = r - q;//Length of the right array
        int L[] = new int [n1];
        int R[] = new int [n2];
        for (int i=0; i<n1; ++i) {//copying arrays
            L[i] = arr[p + i];
        }
        for (int j=0; j<n2; ++j) {
            R[j] = arr[q + 1 + j];
        }
        int i = 0, j = 0;
        int k = p;
        while (i < n1 && j < n2)//comparing and merging array.
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void sort(int arr[], int p, int r)
    {
        if (p < r)
        {
            // Find the middle point
            int q = (p+r)/2;

            // Sort first and second halves
            sort(arr, p, q);
            sort(arr , q+1, r);

            // Merge the sorted halves
            merge(arr, p, q, r);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
/*
when we give the input as
4
9 4 6 2
output :
sorted array is :
2 4 6 9


5
87 45 67 98 12
output:
sorted array is:
12 45 67 87 98

The time complexity of the merge sort is o(nlogn).
 */