import java.util.Scanner;
/*
 * 두 수 비교하기-1330 (브4)
 * 문제 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 * 출력 : 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 * A가 B보다 큰 경우에는 '>'를 출력한다.
 * A가 B보다 작은 경우에는 '<'를 출력한다.
 * A와 B가 같은 경우에는 '=='를 출력한다.
 */
public class No1330 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.print(">");
        } else if(a < b){
            System.out.print("<");
        } else if(a == b){
            System.out.print("==");
        } else {
            System.out.print("정수를 입력하십시오.");
        }
    }
}
/*
* 후기 : 정수 a와 b의 값을 받아서 if문에 등호에 맞는 조건을 넣어준다.
* 정수를 입력을 안했을 수 있으므로, else에 정수를 입력하라는 문구 출력을 넣어주었다.
* */
