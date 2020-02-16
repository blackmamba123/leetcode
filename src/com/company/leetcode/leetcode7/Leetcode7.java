package com.company.leetcode.leetcode7;

public class Leetcode7 {
    public int reverse(int x) {
        String str = String.valueOf(x);
        if(str.charAt(0) == '-'){
            str = str.substring(1, str.length());
            str += "-";
        }
        char[] charArray = str.toCharArray();
        boolean isIgnoreZero = true;
        StringBuilder sb = new StringBuilder();
        for (int i = charArray.length-1; i >= 0; i--){
            if(isIgnoreZero){
                if(charArray[i] == '-'){
                    sb.append(charArray[i]);
                }else if(charArray[i] == '0'){
                    continue;
                }else {
                    sb.append(charArray[i]);
                    isIgnoreZero = false;
                }
            }else {
                sb.append(charArray[i]);
            }
        }

        try {
            return  Integer.parseInt(sb.toString());
        }catch (NumberFormatException ex){
            return 0;
        }
    }
}
