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
        String secondHalf = findSecondHalfIgnoringMiddleCharacter(string, midPoint);
        String reversedSecondHalf = new StringBuilder(secondHalf).reverse().toString();
        return firstHalf.equals(reversedSecondHalf);
    }

    private static String findSecondHalfIgnoringMiddleCharacter(String string, int midPoint) {
        if(hasOddLength(string)) {
            return string.substring(midPoint + 1);
        } else {
            return string.substring(midPoint);
        }
    }

    private static boolean hasOddLength(String string) {
        return string.length() % 2 == 1;
    }

    private static String makePalindrome(String string) {
        for(int index = endOf(string); index >= 0; index--) {
            String firstPart = string.substring(0, index);
            String secondPart = string.substring(index);
            if(alreadyPalindrome(firstPart)) {
                return buildPalindromeFromParts(firstPart, secondPart);
            }
        }
        return null;
    }

    private static int endOf(String string) {
        return string.length() - 1;
    }

    private static String buildPalindromeFromParts(String firstPart, String secondPart) {
        return new StringBuilder(secondPart)
                .reverse()
                .append(firstPart)
                .append(secondPart)
                .toString();
    }

}
