import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        //문제 단순화 : 연속되는 중복을 제거한 배열을 만들어라
        //1. for문을 돌린다.
        //2. 이전 숫자와 같은 지 비교한다. 만약 같다면 리스트에 넣어준다.
        //3. 리스트를 배열로 바꿔준 후 출력한다.

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && arr[i] != arr[i-1]){
                list.add(arr[i]);
            }else if (i == 0){
                list.add(arr[i]);
            }
        }

        Integer [] answer2 = list.toArray(new Integer[list.size()]);
        int []answer = Arrays.stream(answer2).mapToInt(Integer::intValue).toArray();

        return answer;
    }
}