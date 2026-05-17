import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp = br.readLine();
        StringTokenizer st = new StringTokenizer(temp);
        
        int[] inputArr = new int[10];

        int cnt = 0; 
        for (int i = 0; i < 10; i++){

            int tmp = Integer.parseInt(st.nextToken());

            if(tmp  == 0 ) {
                break;
            }
            cnt++;
            inputArr[i] = tmp;
        }

        for(int i = cnt - 1; i >= 0 ; i-- ){
            System.out.printf("%d ", inputArr[i]);
        }

    }
}