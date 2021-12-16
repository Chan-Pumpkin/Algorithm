import java.util.Scanner;
/*
 * A+B-8 : 11022 (브3)
 * 문제 :
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력 :
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 출력 :
 * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 */
public class No11022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int x=1; x<=T; x++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = A+B;

            System.out.println("Case #"+x+": "+A+" + "+B+" = "+C);
        }
    }
}
/*
 * 후기 : 기본적인 방법으로 스캐너의 T의 값을 받아 T만큼 for문을 반복해주고, 반복할 때마다 A와 B의 값을 받아 더한 값을 C에 대입한다.
 * x의 값은 반복될 때마다 출력해서 Case의 번호를 표현하고, A + B = C의 값을 출력한다.
 */
