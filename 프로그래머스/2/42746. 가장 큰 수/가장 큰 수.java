import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] numberArr = new String[numbers.length];
        boolean isAllZero = true;
        
        
        for(int i = 0; i < numberArr.length; i++) {
            numberArr[i] = String.valueOf(numbers[i]);
            if(numbers[i] != 0) isAllZero = false;
        }
        
        Arrays.sort(numberArr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });
        
        for(int i = 0; i < numberArr.length; i++) {
            answer += numberArr[i];
        }
        if(isAllZero) return "0";
        
        return answer;
    }
}