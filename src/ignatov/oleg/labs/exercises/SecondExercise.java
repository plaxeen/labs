package ignatov.oleg.labs.exercises;

import ignatov.oleg.labs.Utils;

public class SecondExercise {
    public SecondExercise() {
        helloMessage();
    }

    private final static double X_START_LIMIT = -3.2;
    private final static double X_FINAL_LIMIT = 3.4;
    private final static double STEP = 0.2;

    private void helloMessage() {
        Utils.showText("Задание номер 2\n\n\tДля x принадлежащего [–3,2; 3,4] вычислить a = x - x^2/2 - x^3/2. Шаг" +
                " изменения x равен 0,2.\n");

        compute();
    }

    private void compute() {
        Utils.showText("Вычисление...");
        double x = X_START_LIMIT;
        do {
            Utils.showNumberByDouble("При x = %.1f – ", x);
            Utils.showNumberByDouble("a = %.1f\n", x - Math.pow(x, 2) / 2 - Math.pow(x, 3) / 2);
            x += STEP;
        } while (x <= X_FINAL_LIMIT);
        Utils.showText("\nЗадание завершено. Возвращение в главное меню...\n\n");
    }
}
