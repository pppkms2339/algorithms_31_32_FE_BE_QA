import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        int a = -100, b = 200;
        for (int i = 0; i < array.length; i++) {
            // Случайное целое число в диапазоне от а до b
            array[i] = (int)((b - a) * Math.random() + a);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input item");
        int item = scanner.nextInt();
        System.out.println(binarySearch(array, item));
    }

    private static int binarySearch(int[] array, int item) {
        int low = 0;                    // нижняя граница поиска
        int high = array.length - 1;    // верхняя граница поиска
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == item) {        // элемент найден
                return mid;
            }
            if (guess > item) {         // "Много"
                high = mid - 1;
            } else {
                low = mid + 1;          // "Мало"
            }
        }
        return -1;
    }
}
