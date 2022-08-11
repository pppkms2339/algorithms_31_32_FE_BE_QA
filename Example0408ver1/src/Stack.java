public class Stack {

    StackItem top;

    public void push(int item) {
        StackItem temp = new StackItem();
        temp.value = item;
        temp.next = top;
        top = temp;
    }

    public int pop() {
        int a = top.value;
        top = top.next;
        return a;
    }

    // Проверка пуст ли стек
    public boolean isEmpty() {
        return (top == null);
    }

    private class StackItem {
        int value;
        StackItem next;
    }
}
