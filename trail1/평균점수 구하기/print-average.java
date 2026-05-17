import java.util.*;
import java.io.*;

public class Main {

    //BufferedReader를 쓸려면 IOException을 던져야 한다 
    public static void main(String[] args) throws IOException {
        // Please write your code here.

        //bufferReader가 아니라 BufferedReader이다 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        
        double[] inputDouble = new double[8];
        double result = 0;
        for(int i = 0; i < 8; i++ ){
        //StringTokenizer의 메소드는 st.next가 아니라 nextToken() 이다. 
         inputDouble[i] =Double.parseDouble(st.nextToken());
         result += inputDouble[i];
        }

        //printf는 자동으로 소수 자리에서 반올림 해준다 
        result = result / 8;

        System.out.printf("%.1f", result);
    }
}