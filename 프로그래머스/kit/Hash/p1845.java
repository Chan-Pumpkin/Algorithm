import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> hs = new HashSet<>();
        int cnt = nums.length / 2;

        for (int i : nums) {
            hs.add(i);
        }

        if (hs.size() > cnt) {
            answer = cnt;
        } else{
            answer = hs.size();
        }
        
        return answer;
    }
}
