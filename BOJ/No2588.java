import java.util.Scanner;

/*
* 곱셈-2588번 (브4)
* 문제 : (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다. (그림 참고)
* (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
*/
public class No2588 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        /** 자릿수 구하기 */
        int aNum = (int)(Math.log10(a)+1);
        int bNum = (int)(Math.log10(b)+1);

        /** 자릿수 체크 */
        if(aNum==3&&bNum==3){
            int b100 = b/100;       // b의 백의 자리
            int b10 = (b%100)/10;   // b의 십의 자리
            int b1 = (b%100)%10;    // b의 일의 자리

            System.out.println(a*b1);
            System.out.println(a*b10);
            System.out.println(a*b100);
            System.out.println(a*b);
        }
    }
}
/*
* 후기 : b의 세자리를 알아야 a와 b의 곱하는 과정의 값들을 알 수가 있다고 생각을 했다.
* 첫 번째로, a와 b가 세자리라는 문제의 조건이 있기에 a와 b의 자릿수를 구해서 if문으로 체크를 해준다.
* 두 번째로, b의 백의 자리/ 십의 자리/ 일의 자리를 구한다.
* 세 번째로, a와 하나씩 곱해주면 된다.
* */
