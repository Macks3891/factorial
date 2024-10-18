import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Вызов метода square
        int result1 = Methods.square(5);
        System.out.println("Square of 5: " + result1);

        int result2 = Methods.square(10);
        System.out.println("Square of 10: " + result2);

        // Вызов метода printFullName
        System.out.println("Makcim" + "Zhirov");
        System.out.println();

        // Вызов метода cornerValuesArray для строк
        String[] words = new String[]{"Java", "World java", "Hello Java World"};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(words)));


        // Вызов метода cornerValuesArray для целых чисел
        int[] intCornerValues = new int[]{3, 7, 1, 9, 4, 6};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(intCornerValues)));


        // Вызов метода cornerValuesArray для символов
        char[] charCornerValues = new char[]{'a', 'z', 'b', 'y', 'c'};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(charCornerValues)));

        // Вызов метода factorial
        int factorialResult = Methods.factorial(5);
        System.out.println("Factorial of 5: " + factorialResult);

        factorialResult = Methods.factorial(10); // Исправлено: добавлен класс Methods
        System.out.println("Factorial of 10: " + factorialResult);

        // Проверка на переполнение стека (базовый случай не определен)
        Methods.factorial(-1); // Исправлено: добавлен класс Methods
    }
}



