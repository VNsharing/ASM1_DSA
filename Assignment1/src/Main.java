// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /* LinkedList */
        LinkedList<String> Animals = new LinkedList();
        // 1 - operators add
        LinkedListADT.addElement(Animals);
        LinkedListADT.addElementWinIndex(Animals, 0, "Tiger");
        LinkedListADT.getElementByIndex(Animals, 2);
        LinkedListADT.scanElementLinkedList(Animals);


        Stack<Integer> numbers = new Stack<>();
        StackADT.stackPush(numbers);
        StackADT.stackPop(numbers);
        StackADT.stackPeek(numbers);
        StackADT.stackSearch(numbers, 3);
        StackADT.checkEmptyStack(numbers);


        Queue<String> fruits = new LinkedList<>();
        QueueLinkedListADT.queueAdd(fruits);
        Queue<Integer> numbers2 = new LinkedList<>();
        QueueLinkedListADT.queueOffer(numbers2);
        QueueLinkedListADT.queuePeek(numbers2);

        /* Cac thuat toan sap xep */
        //bubble sort
        int[] randomNumbers = {100,3,1,20,5,4};
        BubbleSortALU.bubbleSort(randomNumbers, randomNumbers.length);
        BubbleSortALU.printResult(randomNumbers);


        //insertion sort
        int[] randomNumbers2 = {99,6,45,33,9,15,69};
        InsertionSortALU.InsertionSort(randomNumbers2);
        InsertionSortALU.printResult(randomNumbers2);


        int[] randomNumbers3 = {199,36,415,323,90,15,69};
        SelectionSortALU.SelectionSort(randomNumbers3);
        SelectionSortALU.printResult(randomNumbers3);


        int[] randomNumbers4 = {1,2,3,4,5,6};
        MergeSortALU.sort(randomNumbers4, 0, randomNumbers4.length - 1);
        MergeSortALU.printResult(randomNumbers4);
        }
    }
