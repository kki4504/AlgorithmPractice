import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String[] clothe : clothes) {
            if (hashMap.get(clothe[1]) == null) {
                hashMap.put(clothe[1], 1);
            } else {
                hashMap.put(clothe[1], hashMap.get(clothe[1]) + 1);
            }
        }
        int answer = 1;
        for (String s : hashMap.keySet()) {
            answer *= hashMap.get(s) + 1;
        }
        return answer - 1;
    }
}