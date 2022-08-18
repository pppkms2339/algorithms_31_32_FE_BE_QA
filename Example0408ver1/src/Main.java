public class Main {

    public static void main(String[] args) {
        Stack st1 = new Stack();
        char[] brackets = {'(', ')', '[', ']', '{', '}'};
        String str = "(([{]}))";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isOpenBracket(c, brackets)) {
                st1.push(c);
            } else {
                if (st1.isEmpty()) {
                    System.out.println("Wrong bracket string");
                    return;
                }
                char b = st1.pop();
                // Совпадение типов скобок b и c
                if (!isBracketsMatch(b, c, brackets)) {
                    System.out.println("Wrong bracket string");
                    return;
                }
            }
        }
        if (st1.isEmpty()) {
            System.out.println("Correct bracket string");
        } else {
            System.out.println("Wrong bracket string");
        }
    }

    private static boolean isOpenBracket(char c, char[] brackets) {
        for (int i = 0; i < brackets.length; i += 2) {
            if (brackets[i] == c) {
                return true;
            }
        }
        return false;
    }

    // b - открывающаяся скобка
    // c - закрывающаяся скобка
    private static boolean isBracketsMatch(char b, char c, char[] brackets) {
        for (int i = 0; i < brackets.length; i += 2) {
            if (brackets[i] == b && brackets[i + 1] == c) {
                return true;
            }
        }
        return false;
    }

}
