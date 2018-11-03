package assignments.assignment7.question_5;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length == 0)
            return oneArr(nums2);
        if (nums2.length == 0)
            return oneArr(nums1);
        int l1 = nums1.length;
        int l2 = nums2.length;
        int leftNum1 = l1 / 2;
        int leftNum2 = (l1 + l2 + 1) / 2 - leftNum1;

        while (true) {
            int left1 = (leftNum1 == 0) ? Integer.MIN_VALUE : nums1[leftNum1 - 1];
            int left2 = (leftNum2 == 0) ? Integer.MIN_VALUE : nums2[leftNum2 - 1];
            int right1 = (leftNum1 == l1) ? Integer.MAX_VALUE : nums1[leftNum1];
            int right2 = (leftNum2 == l2) ? Integer.MAX_VALUE : nums2[leftNum2];
            if (left1 <= right2 && left2 <= right1) {
                if ((l1 + l2) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return (double) (Math.max(left1, left2));
                }
            } else if (left1 <= right2) {
                leftNum1 += 1;
                leftNum2 = (l1 + l2 + 1) / 2 - leftNum1;
            } else if (left2 <= right1) {
                leftNum1 -= 1;
                leftNum2 = (l1 + l2 + 1) / 2 - leftNum1;
            }
        }
    }

    public double oneArr(int[] nums) {
        if (nums.length % 2 == 0) {
            return (double) (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2;
        } else {
            return (double) (nums[nums.length / 2]);
        }
    }
}
