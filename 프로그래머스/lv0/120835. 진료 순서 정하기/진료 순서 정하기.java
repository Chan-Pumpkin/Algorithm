import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] arrayOrder = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    arrayOrder[i]++;
                }
            }
            arrayOrder[i]++;
        }
        
        return arrayOrder;
    }
}