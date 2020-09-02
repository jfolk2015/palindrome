# Palindrome Example

A code exercise to find the smallest palindrome for any arbitrary string.

Some assumptions:
1. Handle word palindromes, not sentence palindromes (punctuation and spaces are not ignored when determining internal symmetry).
1. Be sensitive to case, so "Eve" is not considered a palindrome because the e's differ in case.

Behavior: 
1. If the provided string is null, function will return null.
1. If the provided string is already a palindrome, function will return that string.
1. Otherwise, the shortest palindrome of the string will be determined and return.

To build the project, clone the repository and run ./gradlew build.

I built this in Java 11 since that is the current long term stable java version.