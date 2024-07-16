import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String line;

        for (int i=0; i<N; i++) {
            line = br.readLine();
            int cnt = 0;
            int totCnt = 0;
            // 각 줄의 문자를 하나씩 확인
            for (int j = 0; j < line.length(); j++) {
                if(line.charAt(j)=='O'){
                    cnt++;
                    totCnt = totCnt+cnt;
                }

                if(line.charAt(j)!='O'){
                    cnt = 0;
                }

                if (j == line.length()-1){
                    System.out.println(totCnt);
                }
            }
        }
    }
}
