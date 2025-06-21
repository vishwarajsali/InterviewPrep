package dev.vishsali.neetcode.practice.blind75.arraysAndHashing;
import java.util.*;

public class EncodeandDecodeStrings {


}


class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuffer encodestr = new StringBuffer();
        for(String s : strs){
            encodestr.append(s.length()).append('/').append(s);
        }

        return encodestr.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> decodeList= new ArrayList<>();
        for(int i = 0; i < s.length();){
            int slash = s.indexOf('/', i);
            int size = Integer.valueOf(s.substring(i, slash));
            decodeList.add(s.substring(slash+1, slash+size+1));
            i = slash+size+1;
        }



        return decodeList;

    }
}
