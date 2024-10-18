public class Methods {
    private static String min;
    private static String max;

    public static int square(int number) {
        return (int) Math.pow(number, 2);
    }

    public static String printFullName(String name, String lastName) {
        return name + " " + lastName;
    }

    public static String[] cornerValuesArray (String[] arr) {
        String min = arr[0];
        String max = arr[0];
        int minn = arr[0].length();
        int maxx = arr[0].length();
        for (int i = 1; i < arr.length; i++){
            if (minn > arr[i].length()) {
                minn = arr[i].length();
                min = arr[i];
            }
            else if (maxx < arr[i].length()) {
                maxx = arr[i].length();
                max = arr[i];
            }
        }

        return new String[] {min, max};
    }
    public static int[] cornerValuesArray(int[] arr) {
        if (arr.length == 0) {
            return new int[] {0, 0};
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
    public static char[] cornerValuesArray(char[] arr) {
        if (arr.length == 0) {
            return new char[] {0, 0};
        }
        char min = arr[0];
        char max = arr[0];

        for (char i =1; i < arr.length; i++) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return new char[] {min, max};
    }
    /**
     * Вычисляет факториал переданного целого числа с использованием рекурсии.
     *
     * @param n целое число, факториал которого нужно вычислить
     * @return факториал переданного числа
     * @throws IllegalArgumentException если переданное число меньше 0
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