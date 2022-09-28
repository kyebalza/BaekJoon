import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        //문제 단순화 : 명함번호기준 대소 구분하기-> 큰값 중 제일 큰값, 작은값 중 제일 큰값 구하기 -> 두 값을 곱하기
        //1. for문으로 명함번호 기준으로 나눈다.
        //2. 그 중 큰값과 작은 값을 구분한다.
        //3. 큰값을 큰값배열(max[]), 작은 값은 작은값배열(min[])에 담는다.
        //4. 각 배열에서 제일 큰 값을 담는다.
        //5. 그 값을 곱해준다.
        int answer = 0;
        int min[] = new int[sizes.length];//작은 값들이 모여있는 배열
        int max[] = new int[sizes.length];//큰 값들이 모여있는 배열
        int width =0;
        int high =0;

        //1. for문으로 명함번호 기준으로 나눈다.
        for (int i = 0; i < sizes.length; i++) {
            width = sizes[i][0];
            high = sizes[i][1];

            //2. 그 중 큰값과 작은 값을 구분한다.
            //3. 큰값을 큰값배열(max[]), 작은 값은 작은값배열(min[])에 담는다.
            if (width>high){
                max[i] = width;
                min[i] = high;
            }else {
                max[i] = high;
                min[i] = width;
            }
        }

        //4. 각 배열에서 제일 큰 값을 담는다.
        width = Arrays.stream(max).max().getAsInt();
        high = Arrays.stream(min).max().getAsInt();

        //5. 그 값을 곱해준다.
        answer = width * high;
        
        return answer;
    }
}