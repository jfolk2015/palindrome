package com.accenture.palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeTest {

    @Test
    public void a_becomes_aa() {
        String palindrome = Palindrome.from("a");
        assertThat(palindrome).isEqualTo("aa");
    }
}
