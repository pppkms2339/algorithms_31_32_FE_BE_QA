public class Main {

    public static void main(String[] args) {
        Stack st1 = new Stack();
        String str = "((()))())";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                st1.push(c);
            } else {
                if (st1.isEmpty()) {
                    System.out.println("Wrong bracket string");
                    return;
                }
                st1.pop();
            }
        }
        if (st1.isEmpty()) {
            System.out.println("Correct bracket string");
        } else {
            System.out.println("Wrong bracket string");
        }
    }

}
