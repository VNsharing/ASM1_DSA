import java.util.Queue;

public class QueueLinkedListADT {

    public static void queueAdd(Queue<String> queue){
        queue.add("apple");
        queue.add("banana");
        queue.add("lemon");
        queue.add("cherry");
        System.out.println("Queue : " + queue);
    }

    public static void queueOffer(Queue<Integer> queue ){
        for (int i = 0; i < 10; i++){
            queue.offer(i);
        }
        System.out.println("Queue LinkedList : " + queue);
    }

    public static void queuePeek(Queue<Integer> queue){
        int accessElement = queue.peek();
        System.out.println("accessElement Queue LinkedList: " + accessElement);
        System.out.println("Queue LinkedList: " + queue);
    }

    public static void queuePoll(Queue<Integer> queue){
        int element = queue.poll();
        System.out.println("Poll element in queue: " + element);
        System.out.println("Queue LinkedList: " + queue);
    }

    public static void queueSearch(Queue<Integer> queue, int i){

    }

    public static void forQueue(Queue<Integer> queue){
        for (int j = 0; j < queue.size(); j++){
            System.out.println("value Element Queue " + queue.peek());
        }
        for (int i: queue){
            System.out.println(i);
        }
    }
}
