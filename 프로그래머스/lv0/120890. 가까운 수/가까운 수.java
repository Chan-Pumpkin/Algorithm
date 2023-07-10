import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int nearNum = 200;
        int nearOrder = 101;
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            if (0 <= array[i] - n ) {
                if(array[i]-n<nearNum){
                    nearNum = array[i] - n;
                    nearOrder = i;
                }
            }
            if (array[i] - n < 0) {
                if((array[i]-n)*-1<nearNum){
                    nearNum = (array[i]-n)*-1;
                    nearOrder = i;
                }
            }
        }
        answer = array[nearOrder];
        
        return answer;
    }
}