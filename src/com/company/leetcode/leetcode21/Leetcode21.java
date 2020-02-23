package com.company.leetcode.leetcode21;

public class Leetcode21 {
    public  static  class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int value){
            this.val = value;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode start = null;
        ListNode l3 = null;
       while (null != l1 && null != l2){
           ListNode node;
           if(l1.val < l2.val){
               node = new ListNode(l1.val);
               l1 = l1.next;
           }else{
               node = new ListNode(l2.val);
               l2 = l2.next;
           }

           if(null == start){
               start = node;
               l3 = start;
           }else {
               l3.next = node;
               l3 = l3.next;
           }
       }

       while (null != l1){
           ListNode node = new ListNode(l1.val);
           if(null == start){
               start = node;
               l3 = node;
               l1 =l1.next;
           }else {
               l3.next = node;
               l3 = l3.next;
               l1 =l1.next;
           }
       }

       while (null != l2){
           ListNode node = new ListNode(l2.val);
           if(null == start){
               start = node;
               l3 = node;
               l2 = l2.next;
           }else {
               l3.next = node;
               l3 = l3.next;
               l2 = l2.next;
           }
       }

       return start;
    }
}
