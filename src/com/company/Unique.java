// find unique no if each no. appears three  times except one no. i.e,unique no.
package com.company;
public class Unique {
    public static void main(String[] args){
        int[] nums = {2,2,2,3,4,4,4,5,5,5};
        int n = Integer.MAX_VALUE;
        int n1 = 0;
        int n2 = 0;
        for(int i = 0;i<nums.length;i++){
            int cn = nums[i] & n;
            int cn1 = nums[i] & n1;
            int cn2 = nums[i] & n2;

            n = n & (~cn);
            n1 = n1 | cn;
            n1 = n1 & (~cn1);
            n2 = n2 | cn1;
            n2 = n2 & (~cn2);
            n= n | cn2;
        }
        System.out.println(n1);
    }
}
