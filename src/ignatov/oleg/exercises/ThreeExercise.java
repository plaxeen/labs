package ignatov.oleg.exercises;

import java.util.Scanner;

import static ignatov.oleg.Utils.showText;

public class ThreeExercise {
    public ThreeExercise() {
        helloMessage();
    }

    private void helloMessage() {
        showText("Задание номер 3.\n\n\tДаны три действительных числа. Возвести в квадрат те из них, значения которых" +
                " неотрицательны.\n");

        inputThreeNumbers();
    }

    private void inputThreeNumbers() {
        showText("Введите три действительных числовых значения через пробел или поочередно через перенос строки.");

        int[] threeNumbers = new int[3];

        Scanner scan = new Scanner(System.in);
        threeNumbers[0] = scan.nextInt();
        threeNumbers[1] = scan.nextInt();
        threeNumbers[2] = scan.nextInt();
        showText("Введены следующие значения: " +
                threeNumbers[0] + ", " +
                threeNumbers[1] + ", " +
                threeNumbers[2] + ".");

        compute(threeNumbers);
    }

    private void compute(int[] threeNumbers) {
        for (int i = 0; i < threeNumbers.length; i++) {
            if (threeNumbers[i] < 0 ) {
                threeNumbers[i] *= -1;
            }
        }
        showText("Посмотрите, что получилось: " +
                threeNumbers[0] + ", " +
                threeNumbers[1] + ", " +
                threeNumbers[2] + ".");
        showText("Задание завершено. Возвращение в главное меню...\n\n");
    }
}
