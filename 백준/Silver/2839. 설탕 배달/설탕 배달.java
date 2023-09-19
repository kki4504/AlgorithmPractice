import java.io.*;
import java.util.*;

interface Main{
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int three = 0;
        int five = 0;
        int N = Integer.parseInt(br.readLine());
        while(true) {
          if (N % 5 == 0) {
            five = N / 5;
            System.out.println(five + three);
            break;
          }
          if (N < 0) {
            System.out.println(-1);
            break;
          }
          N -= 3;
          three++;
        }
    }
}