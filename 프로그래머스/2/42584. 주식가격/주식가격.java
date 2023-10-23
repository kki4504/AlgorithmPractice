class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length; i++) {
            int value = 0;
            for(int j = i + 1; j < prices.length; j++) {
                if (prices[i] <= prices[j]) {
                    value++;
                } else {
                    value = j - i;
                    break;
                }
            }
            answer[i] = value;
        }
        return answer;
    }
}