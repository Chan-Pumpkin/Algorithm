class Solution {
    public String solution(String myString, String pat) { 
        int patLength = pat.length();
        String result = myString.substring(0, myString.lastIndexOf(pat)+patLength);
        
        return result;
    }
}
