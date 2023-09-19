import java.util.*;
import java.io.*;

interface Main {
    static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] intArr = new int[line];
        for (int i = 0; i < line; i++) {
          intArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(intArr);
        
        int result = 0;
        int prev = 0;
        for (int i = 0; i < line; i++) {
          result += prev + intArr[i];
          prev += intArr[i];
        }
        System.out.println(result);
    }
}