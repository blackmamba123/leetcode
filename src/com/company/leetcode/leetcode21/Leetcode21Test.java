package com.company.leetcode.leetcode21;

import org.junit.Test;

public class Leetcode21Test {

    @Test
    public void testMergeTwoLists(){
        Leetcode21 leetcode21 = new Leetcode21();
        int[] array1 = {};
        int[] array2 = {1,3,4};
        Leetcode21.ListNode l1 = createNode(array1);
        Leetcode21.ListNode l2 = createNode(array2);
        Leetcode21.ListNode l3 = leetcode21.mergeTwoLists(l1, l2);
        printNode(l1);
        printNode(l2);
        printNode(l3);
    }

    private static Leetcode21.ListNode createNode(int[] array){
        Leetcode21.ListNode start = null;
        Leetcode21.ListNode ptr = null;
        for (int item : array){
            Leetcode21.ListNode node = new Leetcode21.ListNode(item);
            if(null == start){
                start = node;
                ptr = node;
            }else {
                ptr.next = node;
                ptr = ptr.next;
            }
        }

        return start;
    }

    private static void printNode(Leetcode21.ListNode ptr){
        while (null != ptr){
            System.out.print(ptr.val + " ,");
            ptr = ptr.next;
        }

        System.out.println("");

    }
}
