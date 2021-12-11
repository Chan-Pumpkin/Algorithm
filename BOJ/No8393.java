import java.util.Scanner;
/*
 * 합-8393 (브5)
 * 문제 :
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 *
 * 입력 :
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 *
 * 출력 :
 * 1부터 n까지 합을 출력한다.
 */
public class No8393 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int Num = 0;
        if(1<=n&&n<=10000){
            for(int i=1; i<=n; i++){

                Num = Num+i;

                if(i==n){
                    System.out.print(Num);
                }
            }
        }
    }
}
/*
* 후기 :
* n의 범위를 if문으로 체크해주고, i의 값이 1씩 증가가 되므로, i의 값을 매 반복할 때마다 더해주고, n의 값만큼 반복을 해줘서 해결하였다.
*/
