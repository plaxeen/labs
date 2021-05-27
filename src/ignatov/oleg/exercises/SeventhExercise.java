package ignatov.oleg.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ignatov.oleg.Utils.showText;

public class SeventhExercise {
    public SeventhExercise() {
        helloMessage();
    }

    private static final double MATH_E = 0.0001;

    private void helloMessage() {
        showText("Задание номер 7\n\n\tДаны действительные числа a, b. Последовательность X∨1, X∨2, ... образована\n" +
                "по закону X∨n = 0,5 * a - b * sin(0,5 * n). Найти первое X∨n для которого выполняется условие\n" +
                "X∨n = | X∨n - X∨n-1 | < ɛ.\n");

        inputNums();
    }

    private void inputNums() {
        showText("Введите a и b через пробел или поочередно через перенос строки. Например, если a=1, а b=2 – " +
                "введите: \"1 2\"");

        Scanner scan = new Scanner(System.in);
        try {
            float a = scan.nextFloat();
            float b = scan.nextFloat();
            showText("Значение A=" + a + ", значение B=" + b);

            compute(a, b);
        } catch (InputMismatchException exception) {
            showText("Введены неверные значения!\nЧтобы ввести значения с плавающей запятой (дробные), необходимо " +
                    "указать символ запятой, а не точки\n");
            inputNums();
        }
    }

    private void compute(float a, float b) {
        showText("Вычисление...");
        int n = 1;
        double xPrev = 0;
        double x;
        do {
            x = 0.5 * a - b * Math.sin(0.5 * n);
            if (Math.abs(x - xPrev) <= MATH_E) break;
            xPrev = x;
            n++;
        } while (true);

        showText("X∨"+ n + " = " + x);
        showText("Задание завершено. Возвращение в главное меню...\n\n");
    }
}
