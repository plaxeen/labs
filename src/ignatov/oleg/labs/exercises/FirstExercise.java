package ignatov.oleg.labs.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ignatov.oleg.labs.Utils.showText;

public class FirstExercise {
    public FirstExercise() {
        helloMessage();
    }

    private void helloMessage() {
        showText("Задание номер 1\n\n\tОпределить, принадлежит ли точка с координатами (х, у) заштрихованной части" +
                " плоскости (рисунок 1.8 в файле \"Лабораторные работы по вариантам\")\n");

        inputCoords();
    }

    private void inputCoords() {
        showText("Введите x и y через пробел или поочередно через перенос строки. Например, если x=1, а y=2 – " +
                "введите: \"1 2\"");

        Scanner scan = new Scanner(System.in);
        if (!scan.hasNext("exit")) {
            try {
                float coordinateX = scan.nextFloat();
                float coordinateY = scan.nextFloat();
                showText("Значение X=" + coordinateX + ", значение Y=" + coordinateY + "\n");

                computeArea(coordinateX, coordinateY);
            } catch (InputMismatchException exception) {
                showText("Введены неверные значения!\nЧтобы ввести координату с плавающей запятой (дробную), необходимо " +
                        "указать символ запятой, а не точку\n");
                inputCoords();
            }
        } else {
            showText("Выход из задания номер 1...\n\n");
        }
    }

    private void computeArea(float coordinateX, float coordinateY) {
        if (coordinateY <= -coordinateX + 1 &&
                coordinateY <= coordinateX + 1 &&
                coordinateY >= coordinateX -1 &&
                coordinateY >= -coordinateX - 1) {
            showText("Точка не принадлежит заштрихованной области.");
        } else {
            showText("Точка принадлежит заштрихованной области.");
        }
        showText("Задание завершено. Возвращение в главное меню...\n\n");
    }
}
