public class Main {

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addLast(30);
        deque.addFirst(0);
        System.out.println(deque.deleteLast());     // 30
        System.out.println(deque.deleteFirst());    // 0
        while (!deque.isEmpty()) {
            System.out.println(deque.deleteFirst());    // 10 20
        }
        System.out.println(deque.isEmpty());    // true
    }
}
