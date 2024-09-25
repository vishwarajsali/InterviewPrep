package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

import java.util.ArrayList;
import java.util.List;

public class SerializeandDeserializeStrings {

    public String serialize(String[] list) {
        StringBuffer sb = new StringBuffer();
        for(String str : list){
            int len = str.length();
            sb.append("\\x");
            sb.append(String.format("%02d", len));
            sb.append(str);
        }


        return sb.toString();
    }

    public String[] deserialize(String serializeStr) {
        List<String> decoded_string = new ArrayList<>();

        int i = 0;
        while(i <serializeStr.length()){
            int j = i;
            while(serializeStr.charAt(j)!= 'x')j++;
            int l = Integer.valueOf(serializeStr.substring(j+1 , j+3));
            i = j + 3 + l ;
            decoded_string.add(serializeStr.substring(j+3 , i));
        }

        return decoded_string.toArray(new String[decoded_string.size()]);
    }
}
