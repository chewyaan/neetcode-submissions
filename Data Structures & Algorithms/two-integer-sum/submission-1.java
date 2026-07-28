class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pairs = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
           // (value, index) -> e.g. (3, 0), (4, 1)
           pairs.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int diff = target - nums[j];

            if (pairs.containsKey(diff) && pairs.get(diff) != j) {
                result[0] = Math.min(j, pairs.get(diff));
                result[1] = Math.max(j, pairs.get(diff));
                break;
            }
        }
        return result;
    }
}