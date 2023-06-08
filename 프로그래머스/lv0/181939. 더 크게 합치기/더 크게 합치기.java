class Solution {
    public int solution(int a, int b) {
        String aString = Integer.toString(a);
        String bString = Integer.toString(b);

        String aa = aString + bString;
        String bb = bString + aString;
        
        return Math.max(Integer.parseInt(aa), Integer.parseInt(bb));
    }
}
