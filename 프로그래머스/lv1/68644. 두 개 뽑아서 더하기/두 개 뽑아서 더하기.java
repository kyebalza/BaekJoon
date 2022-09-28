import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


class Solution {
    public int[] solution(int[] numbers) {
        //문제 단순화 : 가능한 모든 수의 덧셈을 보여줘라(중복 값 없이)
        //TreeSet을 사용하지 않았을 때
        //1. 2중 for문으로 하나씩 더해서 모든 값을 도출하기
        //2. array.contaims()메서드를 사용해 특정 값이 있는지 확인
        //3. 만약 true일 경우 추가하지 않고 false 일 경우 추가해주기

        //TreeSet을 사용했을 때
        //1. 중복을 허용하지 않은 TreeSet 사용하기(+오름차순 정렬)
        //2. 2중 for문 을 사용하여 하나씩 꺼내와 더 해주고 TreeSet에 넣어주기
        //3. 다시 배열로 바꿔주기
        int[] answer = {};
        Set<Integer> answerSet = new TreeSet<Integer>();//TreeSet 만들어 주기

        Arrays.sort(numbers);// numbers 정렬

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                answerSet.add(numbers[i]+numbers[j]); //더 해준 값 넣어주기
            }
        }
        answer = answerSet.stream().mapToInt(i->i).toArray();//stream을 사용해 배열로 바꿔주기

        return answer;
    }
}