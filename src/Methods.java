/**
 * Класс Methods содержит статические методы для выполнения различных операций.
 */
public class Methods {

    /**
     * Вычисляет квадрат переданного целого числа.
     *
     * @param number целое число, квадрат которого нужно вычислить
     * @return квадрат переданного числа
     */
    public static int square(int number) {
        return (int) Math.pow(number, 2);
    }

    /**
     * Возвращает полное имя, объединяя имя и фамилию.
     *
     * @param name     имя
     * @param lastName фамилия
     * @return полное имя в формате "Имя Фамилия"
     */
    public static String printFullName(String name, String lastName) {
        return name + " " + lastName;
    }

    /**
     * Находит самую короткую и самую длинную строку из переданных строк.
     *
     * @param arr массив строк
     * @return массив из двух строк: самая короткая и самая длинная строка
     */
    public static String[] cornerValuesArray(String[] arr) {
        if (arr == null || arr.length == 0) {
            return new String[]{"", ""};
        }
        String min = arr[0];
        String max = arr[0];
        int minn = arr[0].length();
        int maxx = arr[0].length();
        for (int i = 1; i < arr.length; i++) {
            if (minn > arr[i].length()) {
                minn = arr[i].length();
                min = arr[i];
            } else if (maxx < arr[i].length()) {
                maxx = arr[i].length();
                max = arr[i];
            }
        }
        return new String[]{min, max};
    }

    /**
     * Находит минимальное и максимальное число из переданных целых чисел.
     *
     * @param arr массив целых чисел
     * @return массив из двух чисел: минимальное и максимальное число
     */
    public static int[] cornerValuesArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[]{0, 0};
        }
        int min = arr[0];
        int max = arr[0];
        for (int num = 1; num < arr.length; num++) {
            if (arr[num] < min) {
                min = arr[num];
            }
            if (arr[num] > max) {
                max = arr[num];
            }
        }
        return new int[]{min, max};
    }

    /**
     * Находит минимальный и максимальный символ из переданных символов.
     *
     * @param arr массив символов
     * @return массив из двух символов: минимальный и максимальный символ
     */
    public static char[] cornerValuesArray(char[] arr) {
        if (arr == null || arr.length == 0) {
            return new char[]{0, 0};
        }
        char min = arr[0];
        char max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new char[]{min, max};
    }
    /**
     * Вычисляет факториал переданного целого числа с использованием рекурсии.
     *
     * n целое число, факториал которого нужно вычислить
     * факториал переданного числа
     * IllegalArgumentException если переданное число меньше 0
     */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}