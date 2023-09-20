import java.util.*;
import java.io.*;
interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int length = N.length();
        if (!N.contains("0")) {
            System.out.println(-1);
        } else {
            char[] charArray = N.toCharArray();
            int acc = 0;
            Arrays.sort(charArray);

            for (int i = 0; i < length; i++) {
                acc += charArray[i] - '0';
            }

            if (acc % 3 != 0) {
                System.out.println(-1);
            } else {
                System.out.println(new StringBuilder(new String(charArray)).reverse());
            }
        }
    }
}