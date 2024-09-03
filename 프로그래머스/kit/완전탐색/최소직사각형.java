import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int size1 = 0;
        int size2 = 0;
        
        for (int i = 0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
        }

        for(int i = 0; i < sizes.length; i++ ){
            for(int j = 0; j < 2; j++){
                if(sizes[i][0] > size1){
                    size1 = sizes[i][0];
                }
                if(sizes[i][1] > size2){
                    size2 = sizes[i][1];
                }
            }
        }
        
        return size1 * size2;
    }
}
