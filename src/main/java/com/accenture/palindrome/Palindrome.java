package com.accenture.palindrome;

public class Palindrome {

    public static String from(String string) {
        if(string == null) {
            return null;
        }
        if(alreadyPalindrome(string)) {
            return string;
        }
        return new StringBuilder(string)
                .reverse()
                .append(string)
                .toString();
    }

    private static boolean alreadyPalindrome(String string) {
        int midPoint = string.length() / 2;
        String firstHalf = string.substring(0, midPoint);
        String secondHalf = string.substring(midPoint);
        String reversedSecondHalf = new StringBuilder(secondHalf).reverse().toString();
        return firstHalf.equals(reversedSecondHalf);
    }

}
