class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 1. 인덱스 0부터 s 이전까지의 앞부분
        String before = my_string.substring(0, s);
        
        // 2. 덮어쓸 위치 이후 남아있는 뒷부분
        String after = my_string.substring(s + overwrite_string.length());
        
        // 3. 앞 + 덮어쓸 문자열 + 뒤 조합
        return before + overwrite_string + after;
    }
}