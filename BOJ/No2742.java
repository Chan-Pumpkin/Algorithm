import java.util.Scanner;
/*
 * 기찍 N-2742 (브3)
 * 문제 :
 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 *
 * 입력 :
 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 *
 * 출력 :
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */
public class No2742 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N<=100000){
            for (int i=N; i>=1;i--){
                System.out.println(i);
            }
        }
    }
}
/*
* 후기 :
* 100,000보다 작은 수의 조건을 if문으로 걸어두고,
* N의 값을 스캐너로 받은 다음,
* for문 초기값 i에 넣어주고,
* 1까지 증감식을 적용하여 반복해서 해결하였다.
*/
