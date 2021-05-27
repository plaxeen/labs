package ignatov.oleg;

public class Utils {
    public static void showText(String text) {
        System.out.println(text);
    }
    public static void showNumberByDouble(String formatText, double num) {
        System.out.format(formatText, num);
    }
    public static void showNumbersToTable(double num, double num1) {
        System.out.format("│ " + (num < 0 ? "":" ") + " %.1f   │ " + (num1 < 0 ? "":" ") + " %.1f   │\n", num, num1);
    }
}
