package com.sparta.timin;

public class PalindromeChecker {

    public static boolean isPalindrome(String wordForChecking){
        String word = wordForChecking.toLowerCase();
        int indexForward = 0;
        int indexBackward = word.length() -1;
        while (indexForward < indexBackward) {
            char forwardChar = word.charAt(indexForward);
            indexForward++;
            char backwardChar = word.charAt(indexBackward);
            indexBackward--;
            if(backwardChar != forwardChar) {
                return false;
            }

        }return true;
    }

}
