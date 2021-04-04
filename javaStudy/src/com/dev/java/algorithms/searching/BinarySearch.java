package com.dev.java.algorithms.searching;

/**
 * class to demo binary search algorithms
 * Very important - input should always sorted then only we can user binary search
 * this will have complexity O(log n) since we don't need to traverse each node.
 * // need to check for recursive binary search
 *
 */
public class BinarySearch {

    // iterative approach
    private static boolean iterativeSearch(int[] array, int value) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return true;
            } else if (array[mid] < value) {
                left = mid + 1;
            } else {
                right = mid-1;
            }
        }
        return false;
    }

    //TODO
    private static boolean recursiveSearch(int[] arr, int start, int end, int searchVal) {
        System.out.println(start);
        System.out.println(end);
        if (end >= start && end <= arr.length-1) {
            int mid = (start + end) / 2;
            if (arr[mid] == searchVal) {
                return true;
            }
            if (arr[mid] < searchVal) {
                return recursiveSearch(arr, start, mid - 1, searchVal);
            }

            return recursiveSearch(arr, mid + 1, end, searchVal);

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 10, 12, 14, 15};
//        System.out.println(iterativeSearch(arr, 10));
        System.out.println(recursiveSearch(arr, 0, arr.length-1, 12 ));
    }

}
