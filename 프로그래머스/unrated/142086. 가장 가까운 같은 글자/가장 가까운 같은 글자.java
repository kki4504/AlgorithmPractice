import java.util.*;

class Solution {
    public int[] solution(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] chars = s.toCharArray();
        int[] answer = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (!hashMap.containsKey(chars[i])) {
                hashMap.put(chars[i], i);
                answer[i] = -1;
                continue;
            }

            answer[i] = i - hashMap.get(chars[i]);
            hashMap.put(chars[i], i);
        }

        
        return answer;
    }
}