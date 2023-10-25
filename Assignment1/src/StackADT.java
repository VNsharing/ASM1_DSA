import java.util.Stack;
public class StackADT {

    public static void stackPush(Stack<Integer> stack){
        for (int i = 0; i < 10; i++){
            stack.push(i);
        }
        System.out.println("Stack: " + stack);
    }

    public static void stackPop(Stack<Integer> stack){
        int element = stack.pop();
        System.out.println("Element pop: " + element);
        System.out.println("Stack pop: " + stack);
    }

    public static void stackPeek(Stack<Integer> stack){
        int element = stack.peek();
        System.out.println("Element on the top: " + element);
        System.out.println("Stack peek: " + stack);
    }

    public static void stackSearch(Stack<Integer> stack, int element){
        int findElement = stack.search(element);
        if (findElement == -1){
            System.out.println(element + "not found");
        }
        else {
            System.out.println(element + "founded in postition" + findElement);
        }
    }

    public static void checkEmptyStack(Stack<Integer> stack){
        boolean result = stack.empty();
        if (result){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack is not empty");
        }
    }
}
