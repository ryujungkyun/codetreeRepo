import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] inputArr = new int[10];
        int sum = 0;
        int cnt = 0;

        for(int i = 0 ; i < 10; i++ ){
            int tmp = Integer.parseInt(st.nextToken());
            //검증로직 
            if(tmp == 0 ) break; 

            //대입로직
            inputArr[i] =tmp; 
            sum += inputArr[i];
            cnt++;
        }

        double avg = (double) sum / cnt; 

        System.out.printf("%d %.1f", sum, avg);

    }
}