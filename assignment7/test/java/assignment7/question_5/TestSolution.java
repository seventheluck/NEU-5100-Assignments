package assignment7.question_5;

import assignments.assignment7.question_5.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution {

    @Test
    void findMedianSortedArraysTest1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        Solution solution = new Solution();
        double output = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(output, 2.0);
    }

    @Test
    void findMedianSortedArraysTest2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        Solution solution = new Solution();
        double output = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(output, 2.5);
    }

    @Test
    void findMedianSortedArraysTest3() {
        int[] nums1 = {1, 5};
        int[] nums2 = {2, 4};
        Solution solution = new Solution();
        double output = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(output, 3.0);
    }

    @Test
    void findMedianSortedArraysTest4() {
        int[] nums1 = {1, 3, 7};
        int[] nums2 = {2, 3, 9};
        Solution solution = new Solution();
        double output = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(output, 3.0);
    }

    @Test
    void findMedianSortedArraysTest5() {
        int[] nums1 = {1, 3, 8, 9, 15};
        int[] nums2 = {7, 11, 18, 19, 21, 25};
        Solution solution = new Solution();
        double output = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(output, 11.0);
    }

    @Test
    void findMedianSortedArraysTest6() {
        int[] nums1 = {};
        int[] nums2 = {7, 11, 18, 19, 21, 25};
        Solution solution = new Solution();
        double output = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(output, 18.5);
    }

    @Test
    void findMedianSortedArraysTest7() {
        int[] nums1 = {7, 11, 18, 19, 21, 25};
        int[] nums2 = {};
        Solution solution = new Solution();
        double output = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(output, 18.5);
    }
}
