public class No4673 {
    public static void main(String[] args) {

        boolean[] check = new boolean[10001];

        for(int i = 1; i < 10001; i++){
            int sum = selfNum(i);

            if(sum<10001){
                check[sum] = true;
            }
        }

        for(int i = 1; i< 10001;i++){
            if(!check[i]){
                System.out.println(i);
            }
        }

    }

    public static int selfNum(int num){
        int sum = num;
        if(num<10) {
            sum = num + num;
        }else{
            while(num!=0){
                sum = sum+(num%10); //일의 자리수를 더한다.
                num = num/10; //다음 숫자를 더하기 위하여, 10씩 나누어 자릿수를 땡겨온다.
            }
        }
        return sum;
    }
}

// 참조 : https://st-lab.tistory.com/53
