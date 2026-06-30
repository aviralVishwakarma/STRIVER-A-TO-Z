class Solution {
    public int mostFrequentEven(int[] nums) {
        int el = -1;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() % 2 == 0) {
                if (entry.getValue() > max ||
                        (entry.getValue() == max && entry.getKey() < el)) {

                    max = entry.getValue();
                    el = entry.getKey();
                }
            }
        }
        return el;
    }
}