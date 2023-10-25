public class InsertionSortALU {
    public static void InsertionSort(int[] arrNumbers){
        int count = arrNumbers.length;
        for (int i = 1; i < count; i++){
            int key = arrNumbers[i];
            int j = i -1;
            /* Move elements of arr[0...i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arrNumbers[j] > key){
                arrNumbers[j+1] = arrNumbers[j];
                j--;
            }
            arrNumbers[j+1] = key;
        }
    }

    public static void printResult(int[] arr){
        System.out.println("Mang sau sap xep bang insertion sort");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
