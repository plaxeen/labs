package ignatov.oleg.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ignatov.oleg.Utils.showText;

public class EighthExercise {
    public EighthExercise() {
        helloMessage();
    }

    private void helloMessage() {
        showText("Задание номер 8.\n\n\tДаны действительные числа x, ɛ . Вычислить с точностью до ɛ");

        inputQuest();
    }

    private void inputQuest() {
        showText("Введите x и ɛ через пробел или поочередно через перенос строки. Например, если x=1, а ɛ=0.0001 – " +
                "введите: \"1 0,0001\"");

        Scanner scan = new Scanner(System.in);
        try {
            float x = scan.nextFloat();
            float e = scan.nextFloat();
            showText("Значение x=" + x + ", значение ɛ=" + e);

            compute(x, e);
        } catch (InputMismatchException exception) {
            showText("Введены неверные значения!\nЧтобы ввести значения с плавающей запятой (дробные), необходимо " +
                    "указать символ запятой, а не точки\n");
            inputQuest();
        }
    }

    private void compute(float x, float e) {
        showText("Вычисление...");
        int k = 0;
        double answer;
        do {
            answer = Math.pow((-1), k) * Math.pow(x, 2 * k + 1) / computeFactorial(k) * (2 * k + 1);
            showText(k + " | " + answer);
            k++;
        } while (Math.abs(answer) <= e);
        showText("Ответ: " + answer);
        showText("Задание завершено. Возвращение в главное меню...\n\n");
    }

    private static int computeFactorial(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * computeFactorial(f - 1);
        }
    }
}
