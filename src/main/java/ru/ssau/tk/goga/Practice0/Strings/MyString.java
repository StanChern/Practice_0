package ru.ssau.tk.goga.Practice0.Strings;

import java.nio.charset.Charset;
import java.util.Arrays;

public class MyString {

    static void splitLine(String myString) {
        for (int i = 0; i < myString.length(); i++) {
            System.out.println(myString.charAt(i));
        }
    }

    static void getStringBytes(String myString) {
        byte[] stringBytes = myString.getBytes();
        for (int bytes : stringBytes) {
            System.out.println(bytes);
        }
    }

   /* static void checkingStrings() {
        String s1 = "S";
        String s2 = new String(s1);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }*/

    static boolean checkPalindrome(String myString) {
        String palindrome = new StringBuilder(myString).reverse().toString();
        return myString.equals(palindrome);
    }

    static boolean differentInRegister(String s1, String s2) {
        return s1.equalsIgnoreCase(s2) && !s1.equals(s2);
    }

   /* static void escapeCharacter() {
        int i = 0;
        //табуляция
        System.out.println("Символ\t№" + ++i);
        //удаление последнего элемента в строке
        System.out.println("Символ\b№" + ++i);
        //переход на новую строку
        System.out.println("Символ\n№" + ++i);
        //игнорирование текста до \r
        System.out.println("Символ\r№" + ++i);
        //символ '
        System.out.println("Символ\'№" + ++i);
        //символ "
        System.out.println("Символ\"№" + ++i);
        // символ /
        System.out.println("Символ\\№" + ++i);
    }*/

    static int findFirstInSecond(String str1, String str2) {
        return str2.indexOf(str1);
    }

    static int findFirstInSecondToo(String str1, String str2) {
        return str2.indexOf(str1, str2.length() / 2);
    }

    static int findFirstInSecondTooToo(String str1, String str2) {
        return str2.lastIndexOf(str1, str2.length() / 2);
    }

    static int countPrefixPostfix(String[] strings, String prefix, String postfix) {
        int count = 0;
        for (String string : strings) {
            if (string.startsWith(prefix) & string.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }

    static int countPrefixPostfixToo(String[] strings, String prefix, String postfix) {
        int count = 0;
        for (String string : strings) {
            if (string.trim().startsWith(prefix) & string.trim().endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }

    static String doPopppo(String str1, String str2, String str3) {
        for (int i = 0; i < 100 && str1.contains(str2); i++) {
            str1 = str1.replaceAll(str2, str3);
        }
        return str1;
    }

    static String getSubstring(String str, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > str.length()) {
            to = str.length();
        }
        if (to <= from) {
            return "";
        }
        return str.substring(from, to);
    }

    static String[] parseStringOnArray(String str) {
        String[] arrayStr = str.split(" ");
        return Arrays.stream(arrayStr)
                .filter(s -> !s.isEmpty())
                .map(s -> s.replace(
                        String.valueOf(s.charAt(0)),
                        String.valueOf(s.charAt(0)).toUpperCase()
                ))
                .toArray(String[]::new);
    }

    static String concatenateStrings(String[] strings) {
        return String.join(", ", strings);
    }

    static String sequenceOfNumbers(int x) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < x; i++) {
            str.append(i);
            str.append(" ");
        }
        return str.toString().trim();
    }

    public static void changeCharsetStr(String str, Charset CharSet1, Charset charSet2){
        String str2 = new String(str.getBytes(CharSet1), charSet2);
        System.out.println(str2);
    }
}