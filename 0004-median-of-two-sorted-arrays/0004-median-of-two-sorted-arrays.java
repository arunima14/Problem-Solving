class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] c = new int[m+n];
        int l = c.length;

        for(int i=0; i<m; i++){
            c[i] = nums1[i];
        }

        for(int i=0; i<n; i++){
            c[i+m] = nums2[i];
        }

        //sort using quicksort
        sort(c, 0, l-1);

        int mid = l/2;
        double median = 0.0;
        if(l%2 != 0)
            median = c[mid]/1.0;
        else
            median = (c[mid] + c[mid-1])/2.0;
        
        return median;
    }

    static void sort(int[] arr, int low, int high){
        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];

        if(low >= high)
            return;

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }            
            while(arr[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        sort(arr, low, e);
        sort(arr, s, high);
    }
}