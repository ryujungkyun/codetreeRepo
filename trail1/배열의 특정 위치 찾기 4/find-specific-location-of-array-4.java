import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] inputArr = new int[10];
        int even = 0;
        int evenCount = 0;
        for(int i = 0; i < 10; i++ ) {
            
            int tmp = Integer.parseInt(st.nextToken());

            //검증 로직
            if(tmp == 0 ) break;

            if (tmp % 2 == 0) {
                even += tmp; 
                evenCount++; 
            }
        }

        System.out.print(evenCount + " " + even);
    }
}