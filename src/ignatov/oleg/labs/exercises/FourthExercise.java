package ignatov.oleg.labs.exercises;

import static ignatov.oleg.labs.Utils.*;

public class FourthExercise {
    public FourthExercise() {
        helloMessage();
    }

    private final static double X_START_LIMIT = -4.2;
    private final static double X_FINAL_LIMIT = 4.2;
    private final static double STEP = 0.2;

    private void helloMessage() {
        showText("Для x принадлежащего [–4,2; 4,2] вычислить y = sin(3 * tg от x * корень из x по модулю). Шаг изменения " +
                "x равен 0,2.\nЗначения x и y вывести в виде таблицы. Найти максимальное значение y на данном " +
                "интервале.");

        compute();
    }

    private void compute() {
        showText("Вычисление...");
        double x = X_START_LIMIT;
        showText("┌─────────┬─────────┐");
        showText("│    x    │    y    │");
        showText("├─────────┼─────────┤");
        do {
            double y = Math.sin(3 * Math.tan(x) * Math.sqrt(Math.abs(x)));
            showNumbersToTable(x, y);
            showText(x + STEP <= X_FINAL_LIMIT ? "├─────────┼─────────┤" : "└─────────┴─────────┘");
            x += STEP;
        } while (x <= X_FINAL_LIMIT);
        showText("\nЗадание завершено. Возвращение в главное меню...\n\n");
    }
}
