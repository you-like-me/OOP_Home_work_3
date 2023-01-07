import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedListNode<String> stringLinkedWords = new LinkedListNode<>();
        stringLinkedWords.addFirst("orrr");
        stringLinkedWords.addFirst("too");
        stringLinkedWords.addFirst("has");
        stringLinkedWords.addFirst("is");
        stringLinkedWords.addLast("be");
        stringLinkedWords.addLast("Vo");
        stringLinkedWords.addLast("an");
        stringLinkedWords.addLast("ups");

        System.out.println("длина списка равна " + stringLinkedWords.size() + "\n");
        System.out.println("Первое слово в списке: " + stringLinkedWords.getElementByIndex(0) + "\n");
        System.out.println("--------------Итерация списка------------");

        for (String item: stringLinkedWords) {
            System.out.println(item);
        }
        }
    }
