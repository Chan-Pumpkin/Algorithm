import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(String a : participant){
            hm.put(a, hm.getOrDefault(a, 0) + 1);
        }
        
        for(String b : completion){
            hm.put(b, hm.get(b) -1 );
        }
        
        for(String c : hm.keySet()){
            if(hm.get(c) != 0){
                answer = c;
            }
        }
        return answer;
    }
}
