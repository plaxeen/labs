package ignatov.oleg.labs2;

import java.util.*;

import static ignatov.oleg.labs.Utils.showText;

public class Main {

    private static String[] base;

    private static final String FIRSTNAME = "fname";
    private static final String SECONDNAME = "sname";
    private static final String LASTNAME = "lname";
    private static final String ADDRESS = "addr";
    private static final String NATION = "nat";
    private static final String BIRTHDAY = "bday";
    private static final String POSITION = "pos";
    private static final String RANK = "rank";

    private static String helloMessage() {
        return "LABS\n\n\tЛабораторная работа: \"файл\", вариант 7.\n\nСтудент группы ИСТЗ-20-1: " +
                "Игнатов Олег Эдуардович.\nДата создания: 24 сентября 2021 года.\n" +
                "Преподаватель ОАиП: Строганова Светлана Михайловна.\n";
    }

    private static void showUserNavigation() {
        showText("Для отладки выполнения задания впишите ключевое слово задания ниже.\n\t\"ready\" — для " +
                "работы с уже реализованной базой данных в программе из 2(ух) человек.\n\nИли \"exit\" для выхода.");

        Scanner scan = new Scanner(System.in);
        if (!scan.hasNext("exit")){
            try {
                String method = scan.next();
                if ("ready".equals(method)) {
                    getReadyDataBase();
                } else {
                    showText("Задания " + method + " не существует.\n\n");
                }
                showUserNavigation();
            } catch (InputMismatchException exception) {
                showText("Введенный текст не поддерживается.\n\n");
                showUserNavigation();
            }
        } else {
            showText("Завершение работы...");
        }
    }

    private static void getReadyDataBase() {
        showText("В базе данных найдено " + base.length + " записи (ей).");
        List<Map<String, String>> outputFields = new ArrayList<>();
        for (String s : base) {
            String[] splitedToOutput = s.split(";");
            Map<String, String> tempField = new HashMap<>();
            tempField.put(LASTNAME, splitedToOutput[0]);
            tempField.put(FIRSTNAME, splitedToOutput[1]);
            tempField.put(SECONDNAME, splitedToOutput[2]);
            tempField.put(ADDRESS, splitedToOutput[3]);
            tempField.put(NATION, splitedToOutput[4]);
            tempField.put(BIRTHDAY, splitedToOutput[5]);
            tempField.put(POSITION, splitedToOutput[6]);
            tempField.put(RANK, splitedToOutput[7]);
            outputFields.add(tempField);
        }

        showText("Вывожу лейтенантов...");
        for (Map<String, String> outputField : outputFields) {
            String check = outputField.get(RANK);
            if (check.toLowerCase().contains("лейтенант")) {
                String result = "\n\tФамилия: " + outputField.get(LASTNAME) +
                        "\n\tИмя: " + outputField.get(FIRSTNAME) +
                        "\n\tОтчество: " + outputField.get(SECONDNAME) +
                        "\n\tПроживает по адресу: " + outputField.get(ADDRESS) +
                        "\n\tНациональность: " + outputField.get(NATION) +
                        "\n\tДата рождения: " + outputField.get(BIRTHDAY) +
                        "\n\tДолжность: " + outputField.get(POSITION) +
                        "\n\tЗвание: " + outputField.get(RANK) + "\n\n";
                showText(result);
            }
        }
    }

    private static void initBase() {
        base = new String[]{"Иванов;" +
                "Иван;" +
                "Иванович;" +
                "12002, Россия, Самарская область, Ряченский район, г. Кинетиков, ул. Никитина, 12, 1;" +
                "Афроамериканец;" +
                "1888, январь 12;" +
                "Начальник штаба;" +
                "Капитан",

                "Гранитов;" +
                "Степан;" +
                "Вячеславович;" +
                "12002, Россия, Самарская область, Ряченский район, г. Кинетиков, ул. Никитина, 12, 2;" +
                "Русский;" +
                "2003, декабрь 21;" +
                "Электромонтер;" +
                "Лейтенант"};
        showText("База проинициализирована");
    }

    public static void main(String[] args) {
        showText(helloMessage());
        initBase();
        showUserNavigation();
    }
}
