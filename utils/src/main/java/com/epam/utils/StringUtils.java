package com.epam.utils;
import org.apache.commons.lang3.math.NumberUtils;
public class StringUtils {
    public static boolean isPositiveNumber(String str) {
       try{     if(!NumberUtils.isNumber(str)){
                return false;}
            if(Float.parseFloat(str)<=0){
                return false;}

        }
       catch(Exception e){
           return false;}
       return true;
       }
    }

