import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int[] inputArr = new int[10];
        for(int i = 0; i < 10; i++) {
            inputArr[i] = sc.nextInt();
        }


        int sum = 0;
        int cnt =0;
        for(int i = 0; i < 10; i++ ){

            if(inputArr[i] >= 250) {
                break;
            }

            cnt++;
            sum += inputArr[i];
        }

        double avg = (double) sum / cnt; 
        
        System.out.printf("%d %.1f\n", sum, avg);

    }
}