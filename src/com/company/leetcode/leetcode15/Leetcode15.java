package com.company.leetcode.leetcode15;

import java.util.ArrayList;
import java.util.List;

public class Leetcode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        addToListSort(resultList, nums[i], nums[j], nums[k]);
                    }
                }
            }
        }

        return resultList;
    }

    private void addToListSort(List<List<Integer>> resultList, int i, int j, int k){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(i);
        integerList.add(j);
        integerList.add(k);
        sortList(integerList);
        boolean isHas = false;
        for(List<Integer> item : resultList){
            if(isListEqual(item, integerList)){
                isHas = true;
                break;
            }
        }

        if(!isHas){
            resultList.add(integerList);
        }
    }

    private void sortList(List<Integer> intList){
        for(int i = 0; i<intList.size(); i++){
            for (int j = i+1 ; j<intList.size(); j++){
                if(intList.get(i) > intList.get(j)){
                    int tmp = intList.get(i);
                    intList.set(i, intList.get(j));
                    intList.set(j, tmp);
                }
            }
        }
    }

    private boolean isListEqual(List<Integer> listA, List<Integer> listB){
        for(int i = 0; i < listA.size(); i++){
            if(listA.get(i) != listB.get(i)){
                return false;
            }
        }

        return true;
    }
}
