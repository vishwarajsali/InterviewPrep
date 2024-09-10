package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

public class ValidateIPAddress {

    public boolean validateIP(String ip) {
        // your code goes here

        String[] str = ip.split("\\.");

        if(str.length != 4) return false;


        for(String s : str) {
            if(! isOneByte(s)) return false;
        }

        return true;
    }


    private boolean isOneByte(String s){
        if(s.length() == 0) return false;


        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }

        if(s.length() >= 2 && s.charAt(0) == '0') return false;


        int num = Integer.parseInt(s);

        return 0 <= num && num <= 255;
    }
}
