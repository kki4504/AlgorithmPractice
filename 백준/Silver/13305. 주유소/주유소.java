import java.io.*;
import java.util.*;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] lengthArray = new int[N - 1];
        int[] oilPriceArray = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            lengthArray[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            oilPriceArray[i] = Integer.parseInt(st.nextToken());
        }

        int minPrice = oilPriceArray[0];
        long result = 0;
        for (int i = 0; i < lengthArray.length; i++) {
            if (oilPriceArray[i] < minPrice) {
                minPrice = oilPriceArray[i];
            }

            result += minPrice * lengthArray[i];
        }

        System.out.println(result);
    }
}