public class Main {

    public static void main(String[] args) {
        Stack st1 = new Stack();
        String[] str = {"1","C"};
        for (int i = 0; i < str.length; i++) {
            if (str[i] == "C") {
                st1.pop();
            } else if (str[i] == "D") {
                st1.push(2 * st1.top());
            } else if (str[i] == "+") {
                int a = st1.pop();
                int b = st1.top();
                st1.push(a);
                st1.push(a + b);
            } else {
                st1.push(Integer.parseInt(str[i]));
            }

        }
        int sum = 0;
        while (!st1.isEmpty()) {
            sum += st1.pop();
        }
        System.out.println(sum);
    }

}
