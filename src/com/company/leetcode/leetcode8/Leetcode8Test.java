package com.company.leetcode.leetcode8;

public class Leetcode8Test {
    public static void main(String[] args){
        Leetcode8 leetcode8 = new Leetcode8();
        int result1 = leetcode8.myAtoi("0  123");
        System.out.println(String.format("result1 = %s  isRight = %s", result1, result1==4193));
    }
}
