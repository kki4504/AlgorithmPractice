import java.io.*;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());

        int result = 0;
        while(true) {
            S -= result;
            result++;
            if (S - result < 0) {
                result --;
                break;
            }
        }
        System.out.println(result);
    }
}