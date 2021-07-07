//  228. Summary Ranges

class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;
        for (int i = 0 ; i < nums.length; i++) {
            int start = nums[i];
            while (i < nums.length - 1 && nums[i+1] - nums[i] == 1) {
                i++;
            }
            if (start != nums[i]) {
                result.add(start+"->"+nums[i]);
            } else {
                result.add(start+"");
            }
        }
        return result;
    }
}