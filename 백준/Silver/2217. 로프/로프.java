import java.util.*;
import java.io.*;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] ropeArray = new int[N];
        for (int i = 0; i < N; i++) {
            ropeArray[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropeArray);
        int result = 0;

        for (int i = 0; i < ropeArray.length; i++) {
            int sum = ropeArray[i] * N;
            if (result < sum) {
                result = sum;
            }
            N --;
        }

        System.out.println(result);
    }
}