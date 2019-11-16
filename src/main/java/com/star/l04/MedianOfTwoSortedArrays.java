package com.star.l04;

/**
 * @author star
 * @Date 2019/11/13.
 * @Description: No Description Yet.
 */
public class MedianOfTwoSortedArrays {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int total = nums1.length + nums2.length;
    if (total % 2 == 1) {
      return findKth(nums1, 0, nums2, 0, total/2+1);
    }else {
      return (findKth(nums1, 0, nums2, 0, total/2) + findKth(nums1, 0, nums2, 0, total/2+1)) /2 ;
    }
  }

  public int findKth(int[] nums1, int a, int[] nums2, int b, int k){
    if (nums1.length - a > nums2.length - b){
      return findKth(nums2, b, nums1, a, k);
    }

    if (nums1.length - a == 0){
      return nums2[b + k -1];
    }

    if (k == 1) {
      return Math.min(nums1[a], nums2[b]);
    }

    int k1 = Math.min(nums1.length - a, k/2);
    int k2 = k - k1;
    if(nums1[a + k1 - 1] < nums2[b + k2 - 1]) {
      return findKth(nums1, a + k1, nums2, b, k - k1);
    }else if (nums1[a + k1 - 1] > nums2[b + k2 - 1]) {
      return findKth(nums1, a, nums2, b + k2, k - k2);
    }else {
      return nums1[a + k1 - 1];
    }
  }
}
