package com.company.leetcode.leetcode12;

public class Leetcode12Test {
    public static void main(String[] args){
        Leetcode12 leetcode12 = new Leetcode12();

        System.out.println(leetcode12.intToRoman(1999));

        for (int i = 0 ; i < 100; i++){
            System.out.println(leetcode12.intToRoman(i));
        }
    }
}
