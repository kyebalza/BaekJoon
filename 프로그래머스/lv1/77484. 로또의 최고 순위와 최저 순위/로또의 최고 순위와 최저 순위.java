class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        //문제 단순화 : 6개 숫자 중 일치하는 숫자를 찾고, 그 숫자가 0일 경우 다 맞췄을 경우와 맞치지 못했을 경우를 찾아라 -> 마지막으로 순위 도출
        //1. for 문을 통해 두 배열 안에 일치하는 숫자가 있으면 카운트해준다.
        //2. 만약에 lottos 배열안의 값이 0이라면 갯수를 카운트한다.
        //3. 1번에서 구해준 카운트 값을 담은 변수와, 1번 값과 2번 값을 더 해준 변수를 구한다.
        //4. 정답 배열안에 두개의 값을 넣는다.
        int[] answer = new int[2];// 정답 배열
        int best =0;// 최댓값
        int worst =0;// 최솟값
        int variable = 0;// 변수(=0에 개수)
        

        for (int i = 0; i < lottos.length; i++) {
            int lottoNum = lottos[i];
            System.out.println(lottoNum);

            if (lottoNum != 0){
                for (int j = 0; j < win_nums.length; j++) {
                    if (win_nums[j] == lottos[i]){
                        worst++;
                        System.out.println("최솟값 : "+worst);
                    }
                }
            }else {
                variable++;
                System.out.println("0값 : "+variable);
            }
        }
        best = worst+variable;
        System.out.println("최대 : "+best);
        
        answer[0] = Math.min(7-best,6);
        answer[1] = Math.min(7-worst,6);
        

        return answer;
    }
}