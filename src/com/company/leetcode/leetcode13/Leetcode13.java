package com.company.leetcode.leetcode13;

public class Leetcode13 {
    public int romanToInt(String s) {
        String[] QianArray = {"", "M", "MM", "MMM" };
        String[] BaiArray = {"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] ShiArray = {"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] GeArray = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        int qian = 0;
        int bai = 0;
        int shi = 0;
        int ge = 0;
        for(int i = 0; i < 10; i++){
            if(i < QianArray.length && s.contains(QianArray[i])){
                 qian = i;
            }

            if(s.contains(BaiArray[i])){
                if(i == 5){
                    if(bai != 4){
                        bai = 5;
                    }
                } else {
                    bai = i;
                }

                if (i == 9 && qian == 1 && !s.contains("MCM")) {
                   qian = 0;
                }

                System.out.println(bai);
            }

            if(s.contains(ShiArray[i])){
                if(i == 5){
                    if(shi != 4){
                        shi = 5;
                    }
                }else {
                    shi = i;
                }

                if (i == 9 && bai == 1 && !s.contains("CXC")) {
                    bai = 0;
                }
            }

            if(s.contains(GeArray[i])){
                if(i == 5){
                    if(ge != 4){
                        ge = 5;
                    }
                }else {
                    ge = i;
                }

                if (i == 9 && shi == 1 && !s.contains("XIX")) {
                    shi = 0;
                }
            }
        }

        return  1000 * qian + 100 * bai + 10 * shi + ge;

    }
}
