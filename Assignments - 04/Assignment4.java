package For_Java.assignments.assignment4;

import java.util.HashMap;
import java.util.Map;

public class Assignment4 {

    /**
     * The deadline of assignment4 is 10/12/2018 23:59 PST.
     * Please feel free to contact Zane and Amanda for any questions.
     */

    /*
     * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
     * s = "leetcode" return 0.
     * s = "loveleetcode" return 2.
     */
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0)
            return -1;
        int[] numlist = new int[26];

        char[] charlist = s.toCharArray();
        for (int i = 0; i < charlist.length; i++) {
            numlist[charlist[i] - 'a']++;
        }

        for (int i = 0; i < charlist.length; i++) {
            if (numlist[charlist[i] - 'a'] == 1)
                return i;
        }

        return -1;
    }

    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {
        if (n < 0)
            return n;
        if (n < 10)
            return n;
        int sum = 0;
        while (true) {
            sum = sum + n % 10;
            n = n / 10;
            if (n == 0)
                break;
        }
        return addDigits(sum);
    }

    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
        int zeroNums = 0;
        int preIndex = 0;
        int nonZeroNums = 0;
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZeroNums++;
                if (zeroNums > 0) {
                    nums[preIndex] = nums[i];
                }
                preIndex = nonZeroNums;
            } else {
                zeroNums++;
            }
        }
        if (preIndex != 0) {
            for (i = preIndex; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }

    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
    public String longestPalindrome(String s) {
        if (s == null)
            return null;
        if (s.length() == 0)
            return "";
        char[] list = s.toCharArray();
        int f = 0;
        int r = 0;
        int max = 0;
        int maxbeg = 0;
        int maxend = 0;
        for (int i = 0; i < list.length; i++) {
            f = i;
            r = i;
            while (f >= 0 && r < list.length) {
                if (list[f] == list[r]) {
                    if (r - f + 1 > max) {
                        max = r - f + 1;
                        maxbeg = f;
                        maxend = r;
                    }
                    f--;
                    r++;
                } else {
                    break;
                }
            }

            f = i;
            r = i + 1;
            while (f >= 0 && r < list.length) {
                if (list[f] == list[r]) {
                    if (r - f + 1 > max) {
                        max = r - f + 1;
                        maxbeg = f;
                        maxend = r;
                    }

                    f--;
                    r++;
                } else {
                    break;
                }
            }
        }

        return s.substring(maxbeg, maxend + 1);
    }

    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			      [4,5,6],
  			      [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								 [8,5,2],
  								  [9,6,3] ],
     */
    public int[][] rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return matrix;
        int length = matrix.length;

        for (int circle = 0; circle < length / 2; circle++) {
            int maxi = length - circle - 1;
            int moveDis = length - 1 - 2 * circle;
            int k = 0;
            for (int i = circle; i < maxi; i++) {
                int temp = matrix[circle][i];
                matrix[circle][i] = matrix[circle + moveDis - k][circle];
                matrix[circle + moveDis - k][circle] = matrix[circle + moveDis][circle + moveDis - k];
                matrix[circle + moveDis][circle + moveDis - k] = matrix[circle + k][length - circle - 1];
                matrix[circle + k][length - circle - 1] = temp;
                k++;
            }
        }
        return matrix;
    }

}

