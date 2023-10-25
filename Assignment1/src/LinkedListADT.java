import java.util.LinkedList;
public class LinkedListADT {

    public static void addElement(LinkedList<String> linkedList){
        linkedList.add("Tom");
        linkedList.add("Cat");
        linkedList.add("Jerry");
        linkedList.add("Mouse");
        System.out.println("LinkedList" +linkedList);
    }

    public static void addElementWinIndex(LinkedList<String> linkedList, int Index, String valueElement){
        linkedList.add(Index, valueElement);
        System.out.println("LinkedList: " + linkedList);
    }

    public static void getElementByIndex(LinkedList<String> object, int index){
        String element = object.get(index);
        System.out.println("get Element : " + element);
        System.out.println("LinkedList : "+ object);
    }

    // clear, remove, constrains, indexOf, lastIndexOf
    // viet phuong thuc duyet qua cac phan tu cua LinkedList
    public static void scanElementLinkedList(LinkedList<String> object){
        for (int i = 0; i < object.size(); i++){
            System.out.println("Element value: " + object.get(i));
        }

        for (String j : object){
            System.out.println("Element value: " + j);
        }
    }
}
