package com.company.leetcode.leetcode14;

public class Leetcode14 {
    public String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }

        if(strs.length == 1){
            return strs[0];
        }

        String longestStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            longestStr = longestCommonPrefix(strs[i], longestStr);
        }

        return longestStr;
    }

    private String longestCommonPrefix(String stra, String strb) {
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i< stra.length() && i < strb.length(); i++){
           if(stra.charAt(i) == strb.charAt(i)){
               sb.append(strb.charAt(i));
           }else {
               break;
           }
       }

       return sb.toString();
    }
}
