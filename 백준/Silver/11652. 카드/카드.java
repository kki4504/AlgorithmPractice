import java.io.*;
import java.util.*;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int line = Integer.parseInt(br.readLine());
        long[] longArr = new long[line];
        for(int i = 0; i < longArr.length; i++) {
            longArr[i] = Long.parseLong(br.readLine());
        }
        
        Arrays.sort(longArr);
        int count = 1, max = 1, maxIndex = 0;
        for(int i = 1; i < longArr.length; i++) {
            if(longArr[i] == longArr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            
            if(count > max) {
                max = count;
                maxIndex = i;
            }
        }
        bw.write(String.valueOf(longArr[maxIndex]));
        bw.flush();
    }
}