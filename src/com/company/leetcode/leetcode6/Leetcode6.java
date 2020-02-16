package com.company.leetcode.leetcode6;

public class Leetcode6 {
    public String convert(String s, int numRows) {
        char[] charArray = s.toCharArray();
        int index = 0;
        int numColumns = charArray.length;
        char[][] juArray = new char[numRows][numColumns];
        for(int column = 0 ; column < numColumns; column++){
            for(int row = 0 ; row < numRows; row++){
                if(0 == column || (column) % (numRows - 1) == 0){
                    juArray[row][column] = charArray[index];
                    index ++;
                }else if(row == numRows - column % (numRows -1) -1){
                    juArray[row][column] = charArray[index];
                    index ++;
                }else {
                    juArray[row][column] = 0;
                }
            }

            if(index == charArray.length){
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int row = 0 ; row < numRows; row ++){
            for(int column = 0 ; column < numColumns; column ++){
                System.out.print(juArray[row][column]);

                if(juArray[row][column] > 0){
                    sb.append(juArray[row][column]);
                }
            }
            System.out.println("");
        }

        return sb.toString();
    }
}
