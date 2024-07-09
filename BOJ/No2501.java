import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 *
 * 약수 구하는 문제
 * 
 * */

public class No2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> divisors = new ArrayList<>();

        if(n>0){
            for(int i=1; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    divisors.add(i);
                    if(i != n/i){
                        divisors.add(n/i);
                    }
                }
            }
        }
        Collections.sort(divisors);

        if (k <= divisors.size()) {
            System.out.println(divisors.get(k - 1));
        } else {
            System.out.println(0);
        }
    }
}
