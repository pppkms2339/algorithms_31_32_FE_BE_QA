public class Main {

    public static void main(String[] args) {
        Stack st1 = new Stack();
        st1.push(10);
        st1.push(100);
        st1.push(200);
        while (!st1.isEmpty()) {
            System.out.println(st1.pop());
        }
        System.out.println(st1.isEmpty());
    }

}
