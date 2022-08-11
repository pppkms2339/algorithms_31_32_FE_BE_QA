// В этом классе определяется целочисленный стек,
// где можно хранить до 10 целочисленных значений
public class Stack {

    int[] array;
    int top;

    // инициализировать массив и вершину стека
    public Stack(int length) {
        array = new int[length];
        top = -1;
    }

    // добавить элемент в стек
    public void push(int item) {
        if (top == array.length - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            array[top] = item;
        }
    }

    // извлечь элемент из стека
    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            int value = array[top];
            top--;
            return value;
        }
    }

}
