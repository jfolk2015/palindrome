package com.accenture.palindrome;

public class Palindrome {

    public static String from(String string) {
        if(string == null) {
            return null;
        }
        if(alreadyPalindromeCountingOdds(string)) {
            return string;
        }
        return makePalindrome(string);
    }

    private static boolean alreadyPalindromeCountingOdds(String string) {
        int midPoint = string.length() / 2;
        String firstHalf = string.substring(0, midPoint);
        String secondHalf;
        if(string.length() % 2 == 1) {
            secondHalf = string.substring(midPoint + 1);
        } else {
            secondHalf = string.substring(midPoint);
        }
        String reversedSecondHalf = new StringBuilder(secondHalf).reverse().toString();
        return firstHalf.equals(reversedSecondHalf);
    }

    private static boolean areHalvesMirrored(String string) {
        int midPoint = string.length() / 2;
        String firstHalf = string.substring(0, midPoint);
        String secondHalf = string.substring(midPoint);
        String reversedSecondHalf = new StringBuilder(secondHalf).reverse().toString();
        return firstHalf.equals(reversedSecondHalf);
    }

    private static String makePalindrome(String string) {

        for(int index = 1; index < string.length(); index++) {
            String firstPart = string.substring(0, index);
            String secondPart = string.substring(index);
            if(areHalvesMirrored(firstPart)) {
                return new StringBuilder(secondPart)
                        .reverse()
                        .append(firstPart)
                        .append(secondPart)
                        .toString();
            }

        }

        if(string.length() % 2 == 1) {
            String firstLetter = string.substring(0, 1);
            String remainingLetters = string.substring(1);
            return new StringBuilder(remainingLetters)
                    .reverse()
                    .append(firstLetter)
                    .append(remainingLetters)
                    .toString();

        }

        return new StringBuilder(string)
                .reverse()
                .append(string)
                .toString();
    }

}
