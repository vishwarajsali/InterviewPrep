package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

public class DecryptMessage {


    public String decrypt(String word) {
        // your code goes here

        StringBuilder sb = new StringBuilder();

        int prev = 1;
        int i = 0;
        for(char c : word.toCharArray()){
            int ascii = (int) c;
            ascii -= prev;
            while(ascii < 'a') ascii += 26;
            sb.append((char) ascii);

            prev += ascii;
            i++;
        }


        return sb.toString();
    }
}

