import java.io.*;

public class No15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bf.readLine());


        for(int i=1; i<=T; i++){
            String sp = bf.readLine();
            int a = Integer.parseInt(sp.split(" ")[0]);
            int b = Integer.parseInt(sp.split(" ")[1]);
            bw.write(a+b+"\n");
        }
        bw.flush();
    }
}
