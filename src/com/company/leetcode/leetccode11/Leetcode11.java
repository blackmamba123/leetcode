package com.company.leetcode.leetccode11;

public class Leetcode11 {
    public int maxArea(int[] height) {
        int maxAreo = 0;
        int left = 0;
        int right = height.length -1;
        while (left < right){
            int aero = (right -left) * Math.min(height[left], height[right]);
            if(maxAreo < aero){
                maxAreo = aero;
            }

            if(height[left] < height[right]){
                left ++;
            }else {
                right -- ;
            }
        }

        return maxAreo;
    }
}
