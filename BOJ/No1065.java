import java.util.Scanner;

public class No1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Math(sc.nextInt()));
        sc.close();
    }

    public static int Math (int N){
        int sum=0;
        int a;
        int b;
        int c;
        int d;

        if(N<100&&N>0){
            sum=N;
        }else if(N>99&&N<=1000){
            sum = 99;
            for(int i=100; i<=N; i++) {
                a = i % 10; //일의 자리
                b = i / 10; //십의 자리와 백의 자리 나눔
                c = b % 10; //십의 자리
                d = b / 10; //백의 자리

                if ((c - d) == (a - c)) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
//  첫째 둘째자리는 무조건 한수
// 셋째자리부터는 무조건 공차를 구해서 한수를 찾아야함.
