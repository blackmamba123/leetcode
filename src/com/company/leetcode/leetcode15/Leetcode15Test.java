package com.company.leetcode.leetcode15;

import java.util.List;

public class Leetcode15Test {
    public static void main(String[] args){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Leetcode15 leetcode15 = new Leetcode15();
        List<List<Integer>> reultList = leetcode15.threeSum(nums);
        for (List<Integer> item : reultList){
            for(int i : item){
                System.out.print(i + ",");
            }

            System.out.println("");
        }
    }
}
