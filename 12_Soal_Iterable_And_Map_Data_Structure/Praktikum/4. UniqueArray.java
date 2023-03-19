public class TwoSum2 {
    public static int[] twoSumBruteForce(int[] nums, int target){
        for(int i =0; i < nums.length; i++){
            for(int j=i + 1; j< nums.length;j++){
                if(nums[j] == (target - nums[i])){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No Pair is Found");
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,6};
        int target = 6;
        System.out.println("Using HashMap" + (twoSumBruteForce(nums, target)));

    }
    
}
