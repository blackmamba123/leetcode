package com.company.leetcode.leetcode12;

public class Leetcode12 {
    public String intToRoman(int num) {
        if(num <0 || num > 3999){
            return "";
        }

        String[] QianArray = {"", "M", "MM", "MMM" };
        String[] BaiArray = {"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] ShiArray = {"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] GeArray = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringBuilder sb = new StringBuilder();
        int qian = num / 1000;
        int bai = (num / 100) % 10;
        int shi = (num / 10) % 10;
        int ge = num % 10 ;

        sb.append(QianArray[qian])
                .append(BaiArray[bai])
                .append(ShiArray[shi])
                .append(GeArray[ge]);

        return sb.toString();
    }
}
