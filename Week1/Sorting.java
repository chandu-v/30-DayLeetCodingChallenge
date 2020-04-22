package Week1;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 3, 1, 10, 2, 14 };
        int[] arr1 = new int[] { 5, 3, 1, 10, 2, 14 };
        int[] arr2 = new int[] { 5, 3, 1, 10, 2, 14 };
        printArray(arr);
        bubbleSort(arr);
        System.out.println();
        selectionSort(arr1);
        System.out.println();
            sort(arr2,0,arr2.length-1);
        printArray(arr2);
    }
 // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    static void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* Copy data to temp arrays */
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        } 
    } 
    

    private static void mergeSort(int[] arr2, int startIndex, int endIndex) {
        // Divide the array into 2
        if(startIndex<endIndex){
            int midd = (startIndex+endIndex)/2;
            mergeSort(arr2, startIndex, midd);
            mergeSort(arr2, midd+1, endIndex);
            // Merge the into 1
            mergeArray(arr2,startIndex,midd,endIndex-1);
        }
        // Sort the subArray
        
        
    }

    

    private static void mergeArray(int[] arr2, int startIndex, int midd, int endIndex) {
        int n1 = midd-startIndex+1;
        int n2 = endIndex-midd;
        // Create two temp arrays
        int [] left = new int[n1];
        int [] right = new int[n2];
        for(int i = 0 ; i < n1 ; i++){
            left[i] = arr2[startIndex+i];
        }
        for(int i = 0 ; i < n2 ; i++){
            right[i] = arr2[midd+i];
        }

        int i = 0 , j = 0, k = 0;
        while(i<n1  &&  j<n2){
            if(left[i]<right[j]){
                arr2[k] = left[i];
                i++;
            }
            else {
                arr2[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr2[k] = left[i];
            i++;
        }
        while(j<n2){
            arr2[k] = right[j];
            j++;
        }

        
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            printArray(arr);
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr){
        int min = Integer.MAX_VALUE;
        int k = 0;
        int temp;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                if(arr[j]<min){
                    min = arr[j];
                    k = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            printArray(arr);
            min = Integer.MAX_VALUE;
        }
    }
}