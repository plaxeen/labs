package ignatov.oleg.exercises;

import static ignatov.oleg.Utils.showText;

public class SixthExercise {
    public SixthExercise() {
        helloMessage();
    }

    private void helloMessage() {
        showText("Задание номер 6\n\n\tВычислить 1-1/2+1/3..+1/9999-1/10000\n");

        compute();
    }

    private void compute() {
        showText("Вычисление...");
        double a = -1;
        double b = 0;
        for (int i = 1; i < 10000; i++) {
            a = -a;
            b = b + a/i;
        }
        showText("Значение выражения равно " + b);
        showText("Задание завершено. Возвращение в главное меню...\n\n");
    }
}
