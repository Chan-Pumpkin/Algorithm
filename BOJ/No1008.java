/*
1008번 문제
- 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
- 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
- 출력 : 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
*/
import java.util.Scanner;

public class No1008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.println(a/b);
    }
}
/*
= 실수형 a와 b를 스캐너로 사용자에게 값을 받아, 두 값을 나눠서 출력함.
* 해당 문제는 데이터 타입에 중요한 포인트였음.
*/
