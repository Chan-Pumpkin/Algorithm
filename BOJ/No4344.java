import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class No4344 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int c = Integer.parseInt(br.readLine());

            for (int i = 0; i < c; i++) {
                String[] line = (br.readLine()).split(" ");
                int personCnt = Integer.parseInt(line[0]);
                int scoreTot = 0;
                int arangeScore = 0;
                int arangeCnt = 0;
                for (int j=1; j<=personCnt; j++){
                    scoreTot += Integer.parseInt(line[j]);
                }

                arangeScore = scoreTot / personCnt;

                for (int j=1; j<=personCnt; j++){
                    if ((Integer.parseInt(line[j]))>arangeScore){
                        arangeCnt++;
                    }
                }

                double percent = (double) arangeCnt/personCnt * 100;
                DecimalFormat df = new DecimalFormat("0.000");
                System.out.println(df.format(percent)+"%");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
