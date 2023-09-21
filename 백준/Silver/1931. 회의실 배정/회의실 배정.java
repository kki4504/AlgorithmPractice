import java.util.*;
import java.io.*;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int line = Integer.parseInt(br.readLine());
        int[][] conferences = new int[line][2];
        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            conferences[i][0] = Integer.parseInt(st.nextToken());
            conferences[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(conferences, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int endTime = 0;

        for (int i = 0; i < line; i++) {
            if (endTime <= conferences[i][0]) {
                endTime = conferences[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}