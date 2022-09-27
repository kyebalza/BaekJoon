import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(long n) {
        //1. 문자열로 바꾸고 하나씩 구분해주기
        //2. 내림차순 정렬
        //3. int 배열 크기 지정해주기
        //4. int 배열에 옮겨 담기
        String[] nToString = Long.toString(n).split("");
        int[] answer = new int[nToString.length];
        for (int i = 0; i < nToString.length; i++) {
            answer[nToString.length -1 -i] = Integer.parseInt(nToString[i]);
            //System.out.println(nToString.length -1 -i);
        }
  
        
        
        return answer;
    }
}