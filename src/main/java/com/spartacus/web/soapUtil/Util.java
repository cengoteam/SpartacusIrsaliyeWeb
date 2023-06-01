package com.spartacus.web.soapUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    public static int getErrorCodeFromMessage(String errorMessage){
        Pattern pattern = Pattern.compile(".*:\\s(\\d{5}):.*");
        Matcher matcher = pattern.matcher(errorMessage);
        String error = "";
        if(matcher.find()){
            error = matcher.group(1);
        }
        if(error.length() == 0){
            return -1;
        }
        return Integer.parseInt(error);
    }
}
