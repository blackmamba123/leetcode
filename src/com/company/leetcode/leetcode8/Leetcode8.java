package com.company.leetcode.leetcode8;

public class Leetcode8 {
    public int myAtoi(String str) {
        char[] charArray = str.trim().toCharArray();
        int result = 0;
        int flag = 0;

        for (char item : charArray) {
            if (item == ' ') {
                if(flag != 0){
                    return result;
                }
                continue;
            } else if (item == '-' || item == '+') {
                if(charArray[0] != item){
                    return result;
                }

                if (flag != 0) {
                    return flag < 0 ? 0 - result : result;
                } else {
                    flag = item == '-' ? -1 : 1;
                }
            } else if (item >= '0' && item <= '9') {
                int itemValue = item - '0';
                if ((Integer.MAX_VALUE - itemValue) / 10 < result) {
                    return flag < 0 ? 0 - Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + itemValue;

                if(result == 0){
                    return 0;
                }
            } else {
                return flag < 0 ? 0 - result : result;
            }
        }

        return flag < 0 ? 0 - result : result;
    }
}
