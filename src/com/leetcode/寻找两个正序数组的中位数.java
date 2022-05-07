package com.leetcode;

public class 寻找两个正序数组的中位数 {

    //要想时间复杂读满足O(log(m+n)) 首先考虑二分查找法
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totallen = nums1.length + nums2.length;
        if(totallen%2 == 1){
            int midIndex = totallen / 2 + 1;
            double median = getKthElement(nums1, nums2, midIndex);
            return median;
        } else {
            int midIndex1 = totallen / 2 - 1, midIndex2 = totallen / 2;
            double median = (getKthElement(nums1, nums2, midIndex1 + 1) + getKthElement(nums1, nums2, midIndex2 + 1)) / 2.0;
            return median;
        }

    }

    /**
     * 主要思路：要找到第 k (k>1) 小的元素，那么就取 pivot1 = nums1[k/2-1] 和 pivot2 = nums2[k/2-1] 进行比较
     *          * 这里的 "/" 表示整除
     *          * nums1 中小于等于 pivot1 的元素有 nums1[0 .. k/2-2] 共计 k/2-1 个
     *          * nums2 中小于等于 pivot2 的元素有 nums2[0 .. k/2-2] 共计 k/2-1 个
     *          * 取 pivot = min(pivot1, pivot2)，两个数组中小于等于 pivot 的元素共计不会超过 (k/2-1) + (k/2-1) <= k-2 个
     *          * 这样 pivot 本身最大也只能是第 k-1 小的元素
     *          * 如果 pivot = pivot1，那么 nums1[0 .. k/2-1] 都不可能是第 k 小的元素。把这些元素全部 "删除"，剩下的作为新的 nums1 数组
     *          * 如果 pivot = pivot2，那么 nums2[0 .. k/2-1] 都不可能是第 k 小的元素。把这些元素全部 "删除"，剩下的作为新的 nums2 数组
     *          * 由于我们 "删除" 了一些元素（这些元素都比第 k 小的元素要小），因此需要修改 k 的值，减去删除的数的个数
     * @param nums1
     * @param nums2
     * @param k
     * @return
     */

    private static double getKthElement(int[] nums1, int[] nums2, int k) {
        int len1 = nums1.length, len2 = nums2.length;
        int index1 = 0, index2 = 0;
        int kthElement = 0;
        while (true){
            if (index1 == len1) {
                return nums2[index2 + k - 1];
            }
            if (index2 == len2) {
                return nums1[index1 + k - 1];
            }
            if (k == 1) {
                return Math.min(nums1[index1], nums2[index2]);
            }
            int half = k / 2;
            int newIndex1 = Math.min(index1 + half, len1) - 1;
            int newIndex2 = Math.min(index2 + half, len2) - 1;
            int pivot1 = nums1[newIndex1], pivot2 = nums2[newIndex2];
            if (pivot1 <= pivot2) {
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            } else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }


        }

    }

    public static void main(String[] args) {
        int []  arr1 = {4,9}, arr2 = {2,5};
        double medianSortedArrays = findMedianSortedArrays(arr1, arr2);
        System.out.println(medianSortedArrays);
    }
}
