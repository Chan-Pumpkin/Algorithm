import java.util.Scanner;

public class No11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();
        sc.close();
        int sum = 0;

        for(int i=0; i<a; i++){
            //'0'은 아스키코드 48
            sum += b.charAt(i)-'0';
        }
        System.out.println(sum);

    }
}
