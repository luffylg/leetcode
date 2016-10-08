package Single_Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

public class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> list=new ArrayList<Integer>();
//        int[] arr={};
        int k=0;
        for (int i = 0; (i <nums.length-1); i++) {
            int n=k;
            if (list.contains(i)){
//                System.out.println("list");
//                for (int m = 0; m < list.size(); m++) {
//                    System.out.println(list.get(m));
//                }
                continue;
            }
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]==nums[j]){
//                    arr[k]=j;
//                    int[] b=new int[]{j};
//                    List list = new ArrayList(Arrays.asList(arr));
//                    list.addAll(Arrays.asList(b));
//                    arr= list.toArray();
//                    arr=arr+new int[]{j};
                    list.add(j);
                    k++;
                    break;
                }

            }
            if (n==k){
                return nums[i];
            }

        }
        return nums[nums.length - 1];
    }
//    public static boolean useLoop(int[] arr, int targetValue) {
//        for(int s: arr){
//            if(s==targetValue)
//                return true;
//        }
//        return false;
//    }
    public static void main(String[] args) {
        System.out.println((new Solution()).singleNumber(new int[]{11,2,7,7,2,18,11,3,18,1,3,1,9}));
    }

}
