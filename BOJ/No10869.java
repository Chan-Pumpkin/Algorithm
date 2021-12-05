/*
10869번 문제
- 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
*/
import java.util.Scanner;

public class No10869 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
/*
- 정수형 a와 b를 스캐너로 사용자에게 값을 받아 출력할 때, 사칙연산으로 출력함.
*/
