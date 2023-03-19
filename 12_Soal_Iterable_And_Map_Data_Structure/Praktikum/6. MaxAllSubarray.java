public class MaxAllSubarray {
    public static int getSum(int arr[], int k){
        int start = 0;
        int sum = 0;
        int maxSum =0;
        for (int end=0; end < arr.length - k; end++){
            sum = sum + arr[end];
            if(end>= k-1){
                maxSum = Math.max(sum, maxSum);
                sum = sum - arr[start];
                start++;
            }
        }
        return maxSum;
    }
    public static void main (String [] args){
        int[] arr = {2, 3, 4, 1, 5};
        int k = 2;
        int result = getSum(arr, k);
        System.out.println(result);
    }
}
