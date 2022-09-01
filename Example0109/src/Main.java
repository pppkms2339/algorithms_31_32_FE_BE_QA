public class Main {

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addLast(30);
        Deque resultDeque = palindrom(deque);
        // Вывод результата на экран
        while (!resultDeque.isEmpty()) {
            System.out.println(resultDeque.deleteFirst());
        }
    }

    private static Deque palindrom(Deque deque) {
        Deque resultDeque = new Deque();
        while (!deque.isEmpty()) {
            int temp = deque.deleteLast();
            resultDeque.addFirst(temp);
            resultDeque.addLast(temp);
        }
        return resultDeque;
    }

}
