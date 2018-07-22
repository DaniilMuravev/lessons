package com.academy;

public class Task8 {
    public static void main(String[] args) {
        String strOrigin = "Тhis is a test test => this is a test " +
                "Тhis is is a test => this is <strong>is</strong> a test";

        String marked = markRepeated(strOrigin);
        System.out.println(marked);
    }

    private static String markRepeated(String str) {
        String regex = "(\\b\\w+\\b)(\\s+)(\\1)";
        String result = str.replaceAll(regex, "$1$2<strong>$3</strong>");
        return result;
    }
}
