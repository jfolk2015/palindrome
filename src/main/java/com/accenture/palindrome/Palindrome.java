package com.accenture.palindrome;

public class Palindrome {

    public static String from(String string) {
        if(string == null) {
            return null;
        }
        if(alreadyPalindrome(string)) {
            return string;
        }
        return makePalindrome(string);
    }

    private static boolean alreadyPalindrome(String string) {
        int midPoint = string.length() / 2;
        String firstHalf = string.substring(0, midPoint);
        String secondHalf = string.substring(midPoint);
        String reversedSecondHalf = new StringBuilder(secondHalf).reverse().toString();
        return firstHalf.equals(reversedSecondHalf);
    }

    private static String makePalindrome(String string) {
        int midPoint = string.length() / 2;
        String firstHalf = string.substring(0, midPoint);
        String secondHalf = string.substring(midPoint);
        if(alreadyPalindrome(firstHalf)) {
            return new StringBuilder(secondHalf)
                    .reverse()
                    .append(firstHalf)
                    .append(secondHalf)
                    .toString();
        }

        return new StringBuilder(string)
                .reverse()
                .append(string)
                .toString();
    }

}
