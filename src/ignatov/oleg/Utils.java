package ignatov.oleg;

public class Utils {
    public static void showText(String text) {
        System.out.println(text);
    }
    public static void showNumberByDouble(String formatText, double num) {
        System.out.format(formatText, num);
    }
    public static void showNumbersToTable(String formatText, double num, double num1) {
        System.out.format(formatText, num, num1);
    }
}
