import java.util.Scanner;
/*
 * A+B-3 -10950 (브3)
 * 문제 :
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력 :
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 출력 :
 * 각 테스트 케이스마다 A+B를 출력한다.
 */
public class No10950 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=1; i<=T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }
    }
}
/*
* 후기 : 테스트의 값까지 반복문을 돌려서 한번 반복할 때마다 A와 B의 값을 더해줘서 해결하였다.
* */
