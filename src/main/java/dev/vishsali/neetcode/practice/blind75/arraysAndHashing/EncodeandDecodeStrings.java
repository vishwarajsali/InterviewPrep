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



    public String encode_1(List<String> strs) {
        StringBuilder sb = new StringBuilder( );


        for(String s : strs){

            sb.append(s.length()).append('/').append(s);
        }
        return sb.toString();
    }

    public List<String> decode_1(String str) {
        List<String> res = new ArrayList<>();
        for(int i = 0; i< str.length();){
            int index = str.indexOf('/', i);

            int size = Integer.valueOf(str.substring(i, index));
            res.add(str.substring(index+1, index+size+1));

            i = index + size + 1;


        }

        return res;
    }
}
