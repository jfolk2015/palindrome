package com.accenture.palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeTest {

    @Test
    void single_letters_are_returned_unchanged() {
        String palindrome = Palindrome.from("a");
        assertThat(palindrome).isEqualTo("a");
    }

    @Test
    void odd_length_string_uses_first_digit_as_middle_of_palindrome() {
        String palindrome = Palindrome.from("12345");
        assertThat(palindrome).isEqualTo("543212345");
    }

    @Test
    void even_length_string_uses_first_digit_as_middle_of_palindrome() {
        String palindrome = Palindrome.from("1234");
        assertThat(palindrome).isEqualTo("4321234");
    }

    @Test
    void existing_palindromes_are_returned_unchanged() {
        String palindrome = Palindrome.from("cc");
        assertThat(palindrome).isEqualTo("cc");
    }

    @Test
    void empty_string_remains_empty_string() {
        String palindrome = Palindrome.from("");
        assertThat(palindrome).isEqualTo("");
    }

    @Test
    void null_remains_null() {
        assertThat(Palindrome.from(null)).isNull();
    }

    @Test
    void ccdc_becomes_cdccdc() {
        String palindrome = Palindrome.from("ccdc");
        assertThat(palindrome).isEqualTo("cdccdc");
    }

    @Test
    void ddc_becomes_cddc() {
        String palindrome = Palindrome.from("ddc");
        assertThat(palindrome).isEqualTo("cddc");
    }

    @Test
    void cjc_remains_the_same() {
        String palindrome = Palindrome.from("cjc");
        assertThat(palindrome).isEqualTo("cjc");
    }

    @Test
    void ejedc_becomes_cdejedc() {
        String palindrome = Palindrome.from("ejedc");
        assertThat(palindrome).isEqualTo("cdejedc");
    }

    @Test
    void capitals_are_considered_different_from_lower_case_letters() {
        String palindrome = Palindrome.from("Eve");
        assertThat(palindrome).isEqualTo("evEve");
    }
}
