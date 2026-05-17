import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        double[] inputArr = new double[n];

        double avg = 0.0;
        for(int i = 0; i < n; i++){
            inputArr[i] = sc.nextDouble();
            avg += inputArr[i];
        }

        avg = avg / n;

        String grade;
        if(avg >= 4.0){
            grade = "Perfect";
        }else if(avg >= 3.0){
            grade = "Good";
        }else {
            grade = "Poor";
        }
        System.out.printf("%.1f\n%s", avg, grade);    
    }
}