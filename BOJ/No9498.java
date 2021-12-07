import java.util.Scanner;
/*
 * 시험 성적-9498 (브4)
 * 문제 : 시험 점수를 입력받아 90 ~ 100점은 A,
 * 80 ~ 89점은 B,
 * 70 ~ 79점은 C,
 * 60 ~ 69점은 D,
 * 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 *
 * 입력 : 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 출력 : 시험 성적을 출력한다.
 */
public class No9498 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int Score = sc.nextInt();

        if(90<=Score&&Score<=100){
            System.out.print("A");
        }else if(80<=Score&&Score<=89){
            System.out.print("B");
        }else if(70<=Score&&Score<=79){
            System.out.print("C");
        }else if(60<=Score&&Score<=69){
            System.out.print("D");
        }else {
            System.out.print("F");
        }
    }
}
/*
* 후기 : 스캐너로 점수를 받아서 if문을 활용해 작성함.
*/
