package ignatov.oleg.labs.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ignatov.oleg.labs.Utils.showText;

public class FifthExercise {
    public FifthExercise() {
        helloMessage();
    }

    private void helloMessage() {
        showText("Задание номер 5\n\n\tДано действительное число А. Найти среди чисел 1, 1+1/2, 1, 1+1/2+1/3, .." +
                " первое, большее А.\n");

        inputNum();
    }

    private void inputNum() {
        showText("Ввод числа a:");

        Scanner scan = new Scanner(System.in);
        if (!scan.hasNext("exit")) {
            try {
                float scannedANum = scan.nextFloat();
                showText("Значение A=" + scannedANum);

                compute(scannedANum);
            } catch (InputMismatchException exception) {
                showText("Введено неверное значение А!\nЧтобы ввести число с плавающей запятой (дробную), необходимо " +
                        "указать символ запятой, а не точку\n");
                inputNum();
            }
        } else {
            showText("Выход из задания номер 5...\n\n");
        }
    }

    private void compute(float a) {
        showText("Вычисление...");
        double answer = 0;
        int i = 1;
        while(answer <= a) {
            answer += 1.0 / i;
            i += 1;
        }
        showText("Первое большее А при А=" + a + " будет " + answer);
        showText("Задание завершено. Возвращение в главное меню...\n\n");
    }
}
