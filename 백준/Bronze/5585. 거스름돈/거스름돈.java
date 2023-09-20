import java.util.*;
import java.io.*;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] coins = {500, 100, 50, 10, 5, 1};
        int returnPrice = 1000 - Integer.parseInt(br.readLine());
        int coinCount = 0;

        for (int i = 0; i < coins.length; i++) {
            if (returnPrice == 0)
                break;
            if (returnPrice >= coins[i]) {
                coinCount += returnPrice / coins[i];
                returnPrice %=  coins[i];
            }

        }
        System.out.println(coinCount);
    }
}