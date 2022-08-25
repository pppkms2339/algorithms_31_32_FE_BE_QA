package telran;

public class Queue {

    private Stack stack1;   // основной, для хранения данных
    private Stack stack2;   // вспомогательный, для операций

    public Queue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void add(int item) {
        stack1.push(item);
    }

    public int delete() {
        // Перекладываем все элементы из stack1 в stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        // На вершине stack2 находится тот элемент, который нам нужен
        // Извлекаем этот элемент и сохраняем
        int result = stack2.pop();
        // Перекладываем элементы обратно в stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return result;
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

}
