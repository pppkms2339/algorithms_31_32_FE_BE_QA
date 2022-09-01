public class Main {

    public static void main(String[] args) {
        // Дан односвязный список (ссылка на начало списка, head).
        // Написать метод, который возвращает true, если список -
        // палиндром и false в обратном случае
        // 1 -> 2 -> 2 -> 1 вернет true
        // 1 -> 2 вернет false
        List list = new List();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(10);
        list.printList();
        System.out.println(list.isPalindrom());
    }
}
