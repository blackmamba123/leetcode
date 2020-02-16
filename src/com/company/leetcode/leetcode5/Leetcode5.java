package com.company.leetcode.leetcode5;

public class Leetcode5 {
    public String longestPalindrome(String s) {
        int length = s.length();
        char[] sArray = s.toCharArray();
        String maxStr = "";
        boolean[][] paArray = new boolean[length+1][length+1];
        for (int len = 1 ; len <= length; len++){
            for (int start = 0; start < length; start++){
                int end = start + len;
                if(end > length){
                    break;
                }

                if(1 == len){
                    paArray[start][end] = true;
                }else if(2 == len){
                    if(sArray[start] == sArray[end - 1]){
                        paArray[start][end] = true;
                    }
                }else {
                    if((paArray[start +1][end -1] && sArray[start] == sArray[end -1])){
                        paArray[start][end] = true;
                    }
                }

                if(paArray[start][end] && len > maxStr.length()){
                    maxStr = s.substring(start, end);
                }
            }
        }

        return maxStr;
    }
}
