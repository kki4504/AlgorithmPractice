import java.util.*;
import java.io.*;

interface Main {
    static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int line = Integer.parseInt(br.readLine());
        String[] serials = new String[line];

        for (int i = 0; i < serials.length; i++) {
            serials[i] = br.readLine();
        }

        Arrays.sort(serials, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                } else {
                    int a = 0;
                    int b = 0;
                    for (int i = 0; i < o1.length(); i++) {
                        int num1 = o1.charAt(i) - '0';
                        int num2 = o2.charAt(i) - '0';

                        if(num1 > 0 && num1 < 10) {
                            a += num1;
                        }
                        if(num2 > 0 && num2 < 10) {
                            b += num2;
                        }
                    }
                    if (a == b) {
                        return o1.compareToIgnoreCase(o2);
                    }
                    return a - b;
                }
            }
        });
        for (int i = 0; i < serials.length; i++) {
            bw.write(serials[i] + "\n");
        }
        bw.flush();
    }
}