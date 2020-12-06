package com.sparta.timin;

public class PalindromeSentence {


    public static String palindromeSentence (String sentence){
        String longestPalindrome="";
        String currentWord;
        String sentenceLowered = sentence.toLowerCase();
        String[] words = sentenceLowered.split(" ");

        for (int i =0; i < words.length; i++) {
            currentWord = words[i];
            if (PalindromeChecker.isPalindrome(currentWord) && currentWord.length() > longestPalindrome.length()){
                longestPalindrome = currentWord;
            }

        }return longestPalindrome;






    }


}
