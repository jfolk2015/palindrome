package com.accenture.palindrome;

public class Palindrome {

    public static String from(String string) {
        return new StringBuilder(string)
                .reverse()
                .append(string)
                .toString();
    }

}
