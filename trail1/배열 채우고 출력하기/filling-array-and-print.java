import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char[] charArr = new char[10];
        for(int i = 0; i < 10; i++){
            String tmp = sc.next();
            charArr[i] = tmp.charAt(0);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 9 ; i >= 0 ; i--) {
            sb.append(charArr[i]);
        }

        System.out.println(sb.toString());
    
    }
}