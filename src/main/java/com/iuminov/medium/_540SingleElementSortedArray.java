package com.iuminov.medium;

public class _540SingleElementSortedArray {

    public int singleNonDuplicate(int[] nums) {

        int left = 0;
        int end = nums.length - 1;

        while (left < end) {
            int mid = (left + end) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] != nums[mid + 1]) {
                end = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    }
}