import java.io.*;
import java.util.*;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int N = Integer.parseInt(br.readLine());

        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());
        int[] array_A = new int[N];
        Integer[] array_B = new Integer[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            array_A[i] = Integer.parseInt(stA.nextToken());
            array_B[i] = Integer.parseInt(stB.nextToken());
        }

        Arrays.sort(array_A);
        Arrays.sort(array_B, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            result += array_A[i] * array_B[i];
        }
        System.out.println(result);
    }
}