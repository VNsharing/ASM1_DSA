public class BubbleSortALU {
    //thuat toan sap sep noi bot
    public static void bubbleSort(int[] arr, int n){
        //arr: array with random numbers
        //n: array size
        int i, j, temp;
        boolean swapped;
        for ( i = 0; i < n-1; i++){
            swapped = false;
            for (j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false){
                break;
            }
        }
    }

    public static void printResult(int[] array){
        System.out.println("mang sau khi sap xep theo bubble sort");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
