package com.company.leetcode.leetcode6;

public class Leetcode6Test {
    public static void main(String[] args){
        Leetcode6 leetcode6 = new Leetcode6();
        String result1 = leetcode6.convert("LEETCODEISHIRING", 3);
        System.out.println(result1 + result1.equals("LCIRETOESIIGEDHN"));
        String result2 = leetcode6.convert("LEETCODEISHIRING", 4);
        System.out.println(result2 + result2.equals("LDREOEIIECIHNTSG"));
    }
}
