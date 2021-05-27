package ignatov.oleg.labs;

import ignatov.oleg.labs.exercises.*;

import java.util.Random;
import java.util.Scanner;

import static ignatov.oleg.labs.Utils.showText;

public class Main {

    private static String helloMessage() {
        return "LABS\n\n\tЛабораторные работы: вариант 8.\n\nСтудент группы ИСТЗ-20-1: Игнатов Олег Эдуардович.\n" +
                "Дата создания: 23 мая 2021 года.\nПреподаватель ОАиП: Строганова Светлана Михайловна.\n";
    }

    private static void showUserNavigation() {
        int rndEgNumber = new Random().nextInt(7) + 1;
        showText("Для отладки выполнения заданий впишите номер задания ниже.\nНапример: \"" + rndEgNumber + "\"\nИли" +
                " \"exit\" для выхода.");

        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        if (!num.equals("exit")){
            try {
                int chapterNumber = Integer.parseInt(num);
                switch (chapterNumber) {
                    case 1:
                        new FirstExercise();
                        break;
                    case 2:
                        new SecondExercise();
                        break;
                    case 3:
                        new ThreeExercise();
                        break;
                    case 4:
                        new FourthExercise();
                        break;
                    case 5:
                        new FifthExercise();
                        break;
                    case 6:
                        new SixthExercise();
                        break;
                    case 7:
                        new SeventhExercise();
                        break;
                    case 8:
                        new EighthExercise();
                        break;
                    default:
                        showText("Задания " + num + " не существует.");
                        break;
                }
                showUserNavigation();
            } catch (NumberFormatException exception) {
                showText("Необходимо указать число от 1 до 8 или слово \"exit\" для завершения работы программы!\n");
                showUserNavigation();
            }
        }
    }

    public static void main(String[] args) {
        showText(helloMessage());
        showUserNavigation();
    }
}