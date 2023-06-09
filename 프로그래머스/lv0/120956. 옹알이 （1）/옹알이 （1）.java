class Solution {
    public int solution(String[] babbling) {
                int count = 0;
        String[] bbArray = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            for (int aa = 0; aa < bbArray.length; aa++) {
                babbling[i] = babbling[i].replace(bbArray[aa], "0");
            }
        }
        for(int i=0; i<babbling.length; i++){
            for(int aa=0; aa<babbling[i].length(); aa++){
                if (babbling[i].charAt(aa) != '0') {
                    babbling[i] = "1";
                }
            }
        }
        for (int i = 0; i < babbling.length; i++) {
            if(babbling[i] != "1"){
                count++;
            }
        }
        return count;
    }
}