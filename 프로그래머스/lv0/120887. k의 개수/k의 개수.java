class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        int compareNum = 0;

        for (int num = i; num <= j; num++) {
            compareNum = num;
            while (compareNum > 0){
                int compareNum1 = compareNum % 10;
                if(k==compareNum1){
                    count++;
                }
                compareNum /= 10;
            }
        }
        return count;
    }
}