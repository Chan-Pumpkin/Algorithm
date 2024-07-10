import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class No3460 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());

            ArrayList<Integer> al = new ArrayList<>();

            int index = 0;
            while (n != 0){
                if(n%2 == 1){
                    al.add(index);
                }
                n = n/2;
                index++;
            }

            for(int j=0; j<al.size(); j++){
                System.out.print(al.get(j));
                if (j < al.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
