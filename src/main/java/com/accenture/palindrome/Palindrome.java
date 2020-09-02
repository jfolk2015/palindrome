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

    private static String makePalindrome(String string) {
        String attemptedPalindrome = attemptComplexPalindrome(string);
        if(attemptedPalindrome == null) {
            return makeSimplePalindrome(string);
        } else {
            return attemptedPalindrome;
        }
    }

    private static String attemptComplexPalindrome(String string) {
        for(int index = 1; index < string.length(); index++) {
            String firstPart = string.substring(0, index);
            String secondPart = string.substring(index);
            if(areHalvesMirrored(firstPart)) {
                return makePalindromeFromParts(firstPart, secondPart);
            }
        }
        return null;
    }

    private static boolean areHalvesMirrored(String string) {
        int midPoint = string.length() / 2;
        String firstHalf = string.substring(0, midPoint);
        String secondHalf = string.substring(midPoint);
        String reversedSecondHalf = new StringBuilder(secondHalf).reverse().toString();
        return firstHalf.equals(reversedSecondHalf);
    }

    private static String makePalindromeFromParts(String firstPart, String secondPart) {
        return new StringBuilder(secondPart)
                .reverse()
                .append(firstPart)
                .append(secondPart)
                .toString();
    }

    private static String makeSimplePalindrome(String string) {
        if(hasOddLength(string)) {
            return makeSimpleOddPalindrome(string);
        } else {
            return makePalindromeFromParts("", string);
        }
    }

    private static String makeSimpleOddPalindrome(String string) {
        String firstLetter = string.substring(0, 1);
        String remainingLetters = string.substring(1);
        return makePalindromeFromParts(firstLetter, remainingLetters);
    }

    private static boolean hasOddLength(String string) {
        return string.length() % 2 == 1;
    }

}
