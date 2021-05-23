package ignatov.oleg;

public class Utils {
    public static void showText(String text) {
        System.out.println(text);
    }
    public static void showNumbersByDouble(String formatText, double num) {
        System.out.format(formatText, num);
    }
}
