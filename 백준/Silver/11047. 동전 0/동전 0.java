import java.io.*;
import java.util.*;

interface Main {
  static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    ArrayList<Integer> A = new ArrayList<>();
    
    for (int i = 0; i < N; i++) {
      A.add(Integer.valueOf(br.readLine()));
    }
    
    int coinCnt = 0;
    for(int i = N - 1; i >= 0; i--) {
      int target = A.get(i);
      if (K / target != 0) {
        coinCnt += K / target;
        K %= target;
      }
    }
    System.out.println(coinCnt);
  }
}

