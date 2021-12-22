import java.util.Arrays;
import java.util.Scanner;
/*
 * 최소, 최대 : 10818 (브3)
 * 문제 :
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * 입력 :
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 *
 * 출력 :
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */
public class No10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A;
        int [] B = new int[N];
        if(N>=1&&N<=1000000){
            for(int i = 0; i<N; i++){
                A = sc.nextInt();
                B[i] = A;
            }
            System.out.print(Arrays.stream(B).min().getAsInt()+" "+Arrays.stream(B).max().getAsInt());
        }
    }
}
/*
* 후기 : 배열을 이용해서, if문으로 N의 범위를 지정한 후, 배열의 값을 넣어서 배열 원소 중에 최소와 최대를 찾아서 출력한다.
*/
