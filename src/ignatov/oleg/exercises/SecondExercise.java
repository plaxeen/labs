package ignatov.oleg.exercises;

import static ignatov.oleg.Utils.*;

public class SecondExercise {
    public SecondExercise() {
        helloMessage();
    }

    private final static double X_START_LIMIT = -3.2;
    private final static double X_FINAL_LIMIT = 3.4;
    private final static double STEP = 0.2;

    private void helloMessage() {
        showText("Задание номер 2\n\n\tДля x принадлежащего [–3,2; 3,4] вычислить a = x - x^2/2 - x^3/2. Шаг" +
                " изменения x равен 0,2.\n");

        compute();
    }

    private void compute() {
        showText("Вычисление...");
        double x = X_START_LIMIT;
        do {
            showNumberByDouble("При x = %.1f – ", x);
            showNumberByDouble("a = %.1f\n", x - Math.pow(x, 2) / 2 - Math.pow(x, 3) / 2);
            x += STEP;
        } while (x <= X_FINAL_LIMIT);
        showText("\nЗадание завершено. Возвращение в главное меню...\n\n");
    }
}
