package com.sparta.timin;

public class Starter {

    public static void start() {
        Printer.printMessage(PalindromeChecker.isPalindrome("bob"));
        Printer.printMessage(PalindromeChecker.isPalindrome("timin"));
        Printer.printMessage(PalindromeChecker.isPalindrome("12321"));

        Printer.printMessage(PalindromeSentence.palindromeSentence("bob took his dog fishing before driving back in his Racecar"));

    }
}
