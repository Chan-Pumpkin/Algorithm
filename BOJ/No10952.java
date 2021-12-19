import java.util.Scanner;
/*
 * X보다 작은 수 : 10952 (브3)
 * 문제 :
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력 :
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 입력의 마지막에는 0 두 개가 들어온다.
 *
 * 출력 :
 * 각 테스트 케이스마다 A+B를 출력한다.
 */
public class No10952 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A!=0||B!=0){
                System.out.println(A+B);
            }
            if(A==0&&B==0){
                break;
            }
        }
    }
}
/*
* 후기 : 입력 중 0 2개가 입력이 되면 끝나는 로직을 만드는 것이 키 포인트인다.
* while 문은 계속 돌아가게 만든 다음, if 문으로 0이라는 값을 두개다 받으면 멈추게 만들었다.
*/
