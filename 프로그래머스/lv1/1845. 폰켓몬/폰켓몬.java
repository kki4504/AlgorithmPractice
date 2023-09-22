import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();

        for (int v : nums) {
            set.add(v);
        }
        if (answer > set.size()) {
            answer = set.size();
        }
        return answer;
    }
}