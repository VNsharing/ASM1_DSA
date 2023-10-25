public class SelectionSortALU {

    public static void SelectionSort(int[] arr){
        int count = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < count; i++){
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i+1; j < count; j++){
                if (arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printResult(int[] arr){
        System.out.println("mang sau sap xep bang Selection Sort");
        for (int i : arr){
            System.out.println(i);
        }
    }
}
