import java.util.*;
import java.io.*;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());

        List<Integer> ropeQueue = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ropeQueue.add(Integer.parseInt(br.readLine()));
        }

        ropeQueue.sort(Comparator.naturalOrder());
        int result = 0;

        for (int i = 0; i < N; i++) {
            int sum = ropeQueue.get(0) * ropeQueue.size();
            if (result < sum) {
                result = sum;
            }
            ropeQueue.remove(0);
        }

        System.out.println(result);
    }
}