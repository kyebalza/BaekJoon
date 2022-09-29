class Solution {
    public long[] solution(int x, int n) {
        //1. for문을 n번 돌려준다.
        //2. 이때 한번씩 돌때마다 x만큼 증가하도록 조건을 준다.
        //3. for문이 x만큼씩 증가할 때 마다 answer 배열에 담아준다. 
        
        
        // 방법1 
        // -> 결과값은 올바르다. 그러나 오답처리
        // -> 실행속도 때문에 문제가 생긴건 아닐까??
        // -> 타입이 문제??
        // int 타입 "-10000000 이상, 10000000 이하인 정수" 는 해당됨
        // 원인 => x*i 연산 전에 x 타입을 int 에서 long으로 바꿔줘야함.
        // 이유 ? 
        
        long[] answer = new long[n];
        for(int i=0; i < n; i++){
            answer[i] = x+(long)x*i;
            //answer[i] = x+(long)(x*i); => 실패 ?
            //answer[i] = (long)(x+(x*i)); => 실패 ?
            //answer[i] = (long)x+(long)x*i; => 성공
            //answer[i] = (long)(x+(x*i)); => 실패 ?
            //answer[i] = x+(long)x*i; => 성공
        }
        return answer;
        
        // //방법2
        // // answer[i-1] = (long)(x*i); => 실패
        // // answer[i-1] = (long)x*i; => 괄호를 제거해주니 성공
        // long[] answer = new long[n];
        // for(int i=1; i <= n; i++){
        //     answer[i-1] = (long)x*i;
        // }
        // return answer;
    }
}