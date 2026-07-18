class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            uniqueNumbers.add(nums[i]);
            if (uniqueNumbers.contains(nums[i+1]) == true) {
                return true;
            }
        }
        return false;
    }
}