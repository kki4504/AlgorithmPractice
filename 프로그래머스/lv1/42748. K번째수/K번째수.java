import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answerIdx = 0;
        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];

            int[] ints = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(ints);
            answer[answerIdx] = ints[k - 1];
            answerIdx++;
        }
        return answer;
    }
}