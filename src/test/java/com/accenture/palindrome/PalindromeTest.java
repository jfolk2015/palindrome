package com.accenture.palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeTest {

    @Test
    public void a_becomes_aa() {
        String palindrome = Palindrome.from("a");
        assertThat(palindrome).isEqualTo("aa");
    }

    @Test
    public void double_and_reverse_string() {
        String palindrome = Palindrome.from("12345");
        assertThat(palindrome).isEqualTo("5432112345");
    }

    @Test
    void existing_palindromes_remain_the_same() {
        String palindrome = Palindrome.from("cc");
        assertThat(palindrome).isEqualTo("cc");
    }
}
