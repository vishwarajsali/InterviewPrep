package dev.vishsali.neetcode.practice.blind75.twoPointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0, len = s.length(), end = s.length()-1;

        while(start <= end){
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);

            if ( !Character.isLetterOrDigit(s.charAt(start))){
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(end))){
                end--;
                continue;
            }

            if(Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) return false;

            start++;
            end--;
        }
        return true;
    }
}
