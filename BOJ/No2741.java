import java.util.Scanner;
/*
 * N 찍기-2741 (브3)
 * 문제 :
 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 *
 * 입력 :
 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 *
 * 출력 :
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */
public class No2741 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            System.out.println(i);
        }
    }
}
/*
 * 후기 :
 * N의 값을 받아서 i가 1부터 N까지 1씩 증가하도록 반복문을 돌리고, 그 안에 i가 출력이 되도록 하여 해결하였다.
 */
