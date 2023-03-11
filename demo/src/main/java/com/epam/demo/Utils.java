package com.epam.demo;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       //magic happens here
        try{  for(String i: args){
            if  (Float.parseFloat(i)<=0){
                return false;}
            if  (!NumberUtils.isNumber(i)){
                return false;}

        }
        }
        catch (Exception e){
            return false;
        }
        return true;
    }}

