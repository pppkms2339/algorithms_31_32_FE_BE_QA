public class Stack {

    StackItem top;

    public void push(char item) {
        StackItem temp = new StackItem();
        temp.value = item;
        temp.next = top;
        top = temp;
    }

    public char pop() {
        char a = top.value;
        top = top.next;
        return a;
    }

    // Проверка пуст ли стек
    public boolean isEmpty() {
        return (top == null);
    }

    private class StackItem {
        char value;
        StackItem next;
    }
}
