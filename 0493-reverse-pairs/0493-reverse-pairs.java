
class Solution {

    public static int merge(int[] nums, int s, int e, int mid) {

        int leftArrLen = mid - s + 1;
        int rightArrLen = e - mid;

        int leftArr[] = new int[leftArrLen];
        int rightArr[] = new int[rightArrLen];

        for (int i = 0; i < leftArrLen; i++) {
            leftArr[i] = nums[s + i];
        }

        for (int j = 0; j < rightArrLen; j++) {
            rightArr[j] = nums[mid + 1 + j];
        }
        int count = 0;
        int j = 0;

        for (int i = 0; i < leftArrLen; i++) {

            while (j < rightArrLen &&
                   (long) leftArr[i] > 2L * rightArr[j]) {
                j++;
            }

            count += j;
        }
        int i = 0;
        j = 0;
        int k = s;

        while (i < leftArrLen && j < rightArrLen) {

            if (leftArr[i] <= rightArr[j]) {
                nums[k] = leftArr[i];
                i++;
            }
            else {
                nums[k] = rightArr[j];
                j++;
            }

            k++;
        }
        while (i < leftArrLen) {
            nums[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArrLen) {
            nums[k] = rightArr[j];
            j++;
            k++;
        }

        return count;
    }

    public static int mergeSort(int nums[], int s, int e) {

        if (s >= e) {
            return 0;
        }

        int mid = s + (e - s) / 2;

        int leftIn = mergeSort(nums, s, mid);
        int rightIn = mergeSort(nums, mid + 1, e);

        int inter = merge(nums, s, e, mid);

        return leftIn + rightIn + inter;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}
