class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
    int n = nums.length;
    int l = 0;
    int r = 1000_000_000;

    while(l < r) {
        int mid = l + (r - l) / 2;
        int index = 0;
        int count = 0;
        while(index + 1 < n) {
            int diff = nums[index + 1] - nums[index];
            if(diff <= mid) {
                count++;
                index += 2;
            } else {
                index++;
            }
        }

        if(count >= p) {
            r = mid;
        } else {
            l = mid + 1;
        }
    }

    int j = 0;
    int result = 0;
    while(j + 1 < n) {
        int diff = nums[j + 1] - nums[j];
        if(diff <= l) {
            result = Math.max(result, diff);
            j += 2;
        } else {
            j++;
        }
    }

    return result;
    }
}