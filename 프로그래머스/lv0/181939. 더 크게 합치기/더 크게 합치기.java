class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String aString = Integer.toString(a);
        String bString = Integer.toString(b);

        String[] aArray = new String[2];
        String[] bArray = new String[2];

        aArray[0] = aString;
        aArray[1] = bString;

        bArray[0] = bString;
        bArray[1] = aString;

        String aJoin = String.join("", aArray);
        String bJoin = String.join("", bArray);

        int aInt = Integer.parseInt(aJoin);
        int bInt = Integer.parseInt(bJoin);

        if (aInt >= bInt) {
            answer = aInt;
        } else {
            answer = bInt;
        }
        
        
        return answer;
    }
}
