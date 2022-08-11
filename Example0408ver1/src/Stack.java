// В этом классе определяется целочисленный стек,
// где можно хранить до 10 целочисленных значений
public class Stack {

    int[] array;
    int top;

    // инициализировать массив и вершину стека
    public Stack() {
        array = new int[10];
        top = -1;
    }

    // добавить элемент в стек
    public void push(int item) {
        if (top == 9) {
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
