package ua.lviv.iot.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextEditor {

    public static String deleteSentences(final int countOfWords, final String textToEdit) {
        String regex = "\\s?[A-Z]{1}(\\w+(\\-|\\;|\\,|\\:)?\\s+){1," + countOfWords + "}\\!\\s?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textToEdit);
        return (matcher.replaceAll(""));
    }

    public static void printEditedText(final int countOfWords, final String textToEdit) {
        String regex = "\\s?[A-Z]{1}(\\w+(\\-|\\;|\\,|\\:)?\\s+){1," + countOfWords + "}\\!\\s";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textToEdit);
        System.out.println(matcher.replaceAll(""));
    }

    public static int scanInt() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        return (int) scanner.nextInt();
    }

    public static String scanString() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
